package hunt.tst.prj.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hunt.tst.prj.model.User;
import hunt.tst.prj.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		
		this.userRepository=userRepository;
		
	}
	
   public User getUserByInn(String inn) {
		
	 User user = this.userRepository.findByInn(inn);
	 	 
	 return user;
	 
	} 
   
   public List<User> getAll(int pageSize, int pageNum) {
		
	  List<User> users= this.userRepository.findAll().stream().filter(o->!o.getDeleted())
			  .skip((pageSize-1)*pageNum)
		      .limit(pageNum)
		      .collect(Collectors.toList());
		
	   return users;
	} 
	
	public User addUser(User user) {
		
		User newUser=null;
		
		try {
			
			newUser=this.userRepository.save(user);
		}catch(Exception e){
			
		}
		
		return newUser;
	} 

	
	public User updUser(User user) {
		
		return this.userRepository.save(user);
	} 
	
	public User delUser(User user) {
		
		User _user=this.userRepository.findByInn(user.getInn());
		_user.setDeleted(true);
		this.userRepository.save(_user);
	
		return _user;
	} 
	
}
