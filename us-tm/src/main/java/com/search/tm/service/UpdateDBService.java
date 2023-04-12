package com.search.tm.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import com.search.tm.repository.CasefileRepository;
import com.search.tm.repository.PropertiesRepository;
import com.search.tm.utils.convert.Dtd2Xsd;
import com.search.tm.utils.parse.TMParser;
import com.search.tm.utils.parse.model.CaseFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.search.tm.model.Casefile;
import com.search.tm.model.Property;

@Service
public class UpdateDBService {
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final String LOADED_LINK_KEY = "loaded_xml";
	private static final String US_TM_XML_RESOURCE ="https://bulkdata.uspto.gov/data/trademark/dailyxml/applications";
	private String currentDTD = "";
	private final PropertiesRepository properiesRepository;
	private final CasefileRepository casefileRepository;
	
	public UpdateDBService(PropertiesRepository propertiesRepository,
			CasefileRepository casefileRepository) {
		
		this.properiesRepository = propertiesRepository;
		this.casefileRepository = casefileRepository;
	}
	
	public void update() throws IOException {
		List<String> links = getXmlList(US_TM_XML_RESOURCE);
		update(links);
	}
		
	public void update(List<String> links) throws IOException {
		
		links.forEach(el->System.out.println(el));
		for(String link : links ) {
			String xmlContent = loadXML(US_TM_XML_RESOURCE+"/"+link);
			break;
		}
		
		String json = objectMapper.writeValueAsString(links);
		Property prop = new Property();
		prop.setName(UpdateDBService.LOADED_LINK_KEY);
		this.properiesRepository.save(prop);
	}
	
	public String loadXML(String uriPath) throws IOException {
		
		StringBuilder buffer = new StringBuilder("");
		URL url = new URL(uriPath);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        InputStream in = connection.getInputStream();
        ZipInputStream zipIn = new ZipInputStream(in);
        ZipEntry entry = zipIn.getNextEntry();

        while(entry != null) {
            int startDTD = -1;
            int finishDTD = -1;
            this.currentDTD = "";
            int val = 0;
            byte[] b = new byte[2048];
            while((val = zipIn.read(b)) != -1) {
            	buffer.append(new String(b,0,val));
            	if(startDTD < 0)
            		startDTD = buffer.toString().indexOf("<!DOCTYPE");
            	else if(this.currentDTD.isEmpty()) {
            		finishDTD = buffer.toString().indexOf("]>");
            		if(finishDTD > 0) {
            			this.currentDTD = buffer.toString().substring(startDTD, finishDTD);
            		    System.out.println(this.currentDTD);
             		}
            	}
             }
            System.out.println("Reading DONE "+buffer.length());
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
            
        }
        
        List<CaseFile> l = TMParser.launch(buffer.toString());
        int i = 0;
        int k = 0;
        for(CaseFile cf:l) {
        	i++;
        	if(i>1000) {
        	    k++;
        	    i = 0;
        		System.out.println("SAVE DB === "+k);
        	}
        	Casefile casefile = new Casefile();
        	TMParser.caseFileToEntity(cf, casefile);
        	Casefile instCasefile  = this.casefileRepository.findBySerialNumber(cf.getRegistrationNumber());
        	if(instCasefile != null) {
        		TMParser.updateInstance(instCasefile, casefile);
        		this.casefileRepository.save(instCasefile);
        	} else
        	   this.casefileRepository.save(casefile);
        }
        
		return buffer.toString();
	}
	
	@Scheduled(cron = "1 * * * * *")
	void updateMonitor() throws IOException {
//		List<String> links = notifytoLoadXML();
//		if(!links.isEmpty()) {
//			update(links);
//		}
		System.out.println("Scheduled ");
	}
		
	public void pojoGenerate() {
		
		String[] parameters = new String[7];
		parameters[0] = this.currentDTD;
		Dtd2Xsd.launch(parameters);
		ProcessBuilder builder = new ProcessBuilder("/usr/lib/jvm/java-1.8.0-openjdk-amd64/bin/xjc","ustm.xsd"); // ustm.xsd
		Process proc;
		try {
			proc = builder.start();
			proc.destroy();
			if (proc.isAlive()) {
			    proc.destroyForcibly();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private List<String> getXmlList(String uriPath) throws IOException {
		
		List<String> uriLinks = new ArrayList<>();
	    Document doc = Jsoup.connect(uriPath).get();
	    Elements hrefs = doc.select("a[href]");
	    uriLinks = hrefs.stream()
	    		.map(el -> el.attr("href"))
	    		.filter(el->el.contains("zip"))
	    		.collect(Collectors.toList());
	    return uriLinks; 
	}
	
	public List<String> notifytoLoadXML() throws IOException {
		
		List<String> newLinks = getXmlList(US_TM_XML_RESOURCE);
		String jsonList = properiesRepository.findAll()
				.stream().collect(Collectors.toMap(Property::getName, Property::getValue))
				.get(UpdateDBService.LOADED_LINK_KEY);
		String[] l = objectMapper.readValue(jsonList, String[].class);
		List<String> handledLinks = Arrays.asList(l); 
		newLinks.removeAll(handledLinks);
		return newLinks;
	}
}
