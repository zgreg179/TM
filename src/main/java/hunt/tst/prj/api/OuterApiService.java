package hunt.tst.prj.api;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import hunt.tst.prj.exception.OuterApiException;

@Service
public class OuterApiService {

	private static final String BASE_URL = "https://reqres.in/api/users?page=2";
		
	@Autowired
	OuterApiService(){
		
	}
	
	public String makeRequest() throws OuterApiException{
		
		String resul t= "";
		try {
			 result = new RestTemplate().getForObject(OuterApiService.BASE_URL, String.class);
		}catch (Exception e) {
			result = "error api service: "+e.getMessage();
			throw new OuterApiException(e.getMessage());
		}
		
		String score = "*{\"time\":\""+LocalDateTime.now().toString()+"\"result\":\""+result+"}";
		return score;
	}
}
