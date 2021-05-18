package hunt.tst.prj.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hunt.tst.prj.exception.EntityNotFoundException;
import hunt.tst.prj.model.Enterprise;
import hunt.tst.prj.model.User;
import hunt.tst.prj.service.UserService;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/v1/empl")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		
		this.userService= userService;
	}
	
	@RequestMapping(value = "/user/{inn}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable(value = "inn") String inn) throws EntityNotFoundException {
		   
		   User _user=this.userService.getUserByInn(inn);
	       if (_user == null) {
	           throw new EntityNotFoundException();
	       }
		return new ResponseEntity<User>(_user, HttpStatus.OK);
	} 
	
	@RequestMapping(value = "/job/{inn}", method = RequestMethod.GET)
	public Set<Enterprise> getEnterprises(@PathVariable(value = "inn") String inn) throws EntityNotFoundException {
			
			return this.userService.getUserByInn(inn).getEnterprises();
	} 
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)	
    public ResponseEntity<User> addUser(@RequestBody User user) throws EntityNotFoundException {
		
    	User _user = this.userService.addUser(user);
    	if (_user == null) {
	           throw new EntityNotFoundException();
	     }
		return new ResponseEntity<User>(_user, HttpStatus.OK);
	} 

	@RequestMapping(value = "/upd", method = RequestMethod.POST)
    public ResponseEntity<User> updUser(@RequestBody User user) throws EntityNotFoundException {
    	
    	User _user = this.userService.updUser(user);
    	if (_user == null) {
	           throw new EntityNotFoundException();
	     }
		return new ResponseEntity<User>(_user, HttpStatus.OK);
	} 
	
	@RequestMapping(value = "/del/{inn}}", method = RequestMethod.GET)	
    public ResponseEntity<User> delUser(@PathVariable(value = "inn") String inn) throws EntityNotFoundException {
		
		User _user = this.userService.getUserByInn(inn);
	    if (_user == null) {
	           throw new EntityNotFoundException();
	     }
	    _user = this.userService.delUser(_user);
		
	    return new ResponseEntity<User>(_user, HttpStatus.OK);
	}  

	@RequestMapping(value = "/all/{pageSize}/{pageNum}", method = RequestMethod.GET)	
    public ResponseEntity<List<User>> getAll(@PathVariable(value = "pageSize") Integer pageSize, @PathVariable(value = "pageNum") Integer pageNum) 
    throws EntityNotFoundException {
		
    	List<User> allUser=this.userService.getAll(pageSize, pageNum);
	    if(allUser.isEmpty()) 
	    	 throw new EntityNotFoundException();
    	return new ResponseEntity<List<User>>(allUser, HttpStatus.OK);
	} 
}
