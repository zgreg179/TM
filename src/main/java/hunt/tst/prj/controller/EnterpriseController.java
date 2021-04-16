package hunt.tst.prj.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;

import hunt.tst.prj.exception.EntityNotFoundException;
import hunt.tst.prj.model.Enterprise;
import hunt.tst.prj.model.User;
import hunt.tst.prj.model.dto.ChangeJobDTO;
import hunt.tst.prj.service.EnterpriseService;

@RestController
@RequestMapping("/api/v1/entr")
public class EnterpriseController {
	
	private final EnterpriseService enterpriseService;
	
	@Autowired
	public EnterpriseController(EnterpriseService enterpriserService) {
		
		this.enterpriseService= enterpriserService;
	}
	
	@RequestMapping(value = "/get/{edrpo}", method = RequestMethod.GET)	
	public ResponseEntity<Enterprise>  getEnterprise(@PathVariable(value = "edrpo") String edrpo) throws EntityNotFoundException {
		   
		   Enterprise _enterprise=this.enterpriseService.getEnterprise(edrpo);
		   if (_enterprise==null) {
	           throw new EntityNotFoundException();
	       }
		   
		   return new ResponseEntity<Enterprise>(_enterprise, HttpStatus.OK);
	} 
	
	@RequestMapping(value = "/users/{edrpo}", method = RequestMethod.GET)
	public ResponseEntity<Set<User>> getUser(@PathVariable(value = "edrpo") String edpro) throws EntityNotFoundException {
		   
		   Set<User> users =this.enterpriseService.getEnterprise(edpro).getUsers();
		   if (users.isEmpty()) {
	           throw new EntityNotFoundException();
	       }
		   
		   return new ResponseEntity<Set<User>>(users, HttpStatus.OK);
	} 
	
   @RequestMapping(value = "/change", method = RequestMethod.POST)
   public ResponseEntity<User> changeJob(@RequestBody ChangeJobDTO dto) {
	   
	   User _user=this.enterpriseService.changeEnterprise(dto);
	   
	   return new ResponseEntity<User>(_user, HttpStatus.OK);
	} 

   @RequestMapping(value = "/all", method = RequestMethod.GET)	
   public ResponseEntity<List<Enterprise>> getAll() throws EntityNotFoundException {
		
	   List<Enterprise> allEnterprise=this.enterpriseService.getAll();
	   if(allEnterprise.isEmpty()) 
	    	 throw new EntityNotFoundException();
   	   
	   return new ResponseEntity<List<Enterprise>>(allEnterprise, HttpStatus.OK);
	} 
}
