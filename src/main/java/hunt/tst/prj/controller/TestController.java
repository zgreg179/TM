package hunt.tst.prj.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@GetMapping("/test")
	public String welcomepage() {
		return "Welcome to Yawin Tutor";
	}

	@GetMapping("/question")	
	public String[]  getEnterprise()  {
		   
		   String[] ar = {"Вопрос1","Вопрос2","Вопрос3","Вопрос4","Вопрос5"};
		   
		   return ar;
	} 
	
	@GetMapping("/result")	
	public String getUser()  {
		   
		   return "\"userId\":1,\"testId\":34,\"data\":\"2020-10-20 11:36:47\",\"L\":\"3\",\"M\":\"8\",\"O\":\"\",\"K\":\"45\",\"P\":\"86\",\"T\":\"56\"";
	}
}
