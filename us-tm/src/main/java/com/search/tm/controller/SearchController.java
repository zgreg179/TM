package com.search.tm.controller;

import com.search.tm.repository.CasefileRepository;
import com.search.tm.service.UpdateDBService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RequestMapping("/ustm/v1/search")
@RestController
public class SearchController {

	private static final String TEST_URI = "https://bulkdata.uspto.gov/data/trademark/dailyxml/applications/apc18840407-20221231-05.zip";
    private final UpdateDBService updateDBService;
    private final CasefileRepository casefileRepository;

    SearchController(UpdateDBService updateDB,
    		         CasefileRepository casefileRepository){
    	
    	this.casefileRepository = casefileRepository;
    	this.updateDBService = updateDB;
    }
	
	
	 @GetMapping("/initialUpd")
	 public String testGet() {
		 
		 try {
			this.updateDBService.update();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "INITIAL UPDATE FINISH ";
	 }
	 

	 @PostMapping("/")
	 public String probePost(@RequestBody String request) {
		 
		 return request;
	 } 
}
