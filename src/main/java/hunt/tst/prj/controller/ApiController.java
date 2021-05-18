package hunt.tst.prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hunt.tst.prj.exception.OuterApiException;
import hunt.tst.prj.api.OuterApiService;



@RestController
public class ApiController {
	
	
	private final OuterApiService outerApiService;
	
	@Autowired
	public ApiController(OuterApiService outerApiService) {
		
		this.outerApiService = outerApiService;
	}
	
	@GetMapping("/api/v1/api")
	public ResponseEntity<String> getResource() throws OuterApiException {
		
		String res = this.outerApiService.makeRequest();
	       	       
		return new ResponseEntity<String>(res, HttpStatus.OK);
	} 
	
}
