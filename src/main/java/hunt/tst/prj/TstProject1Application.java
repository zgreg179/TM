package hunt.tst.prj;

import java.time.LocalDate;
import java.util.HashSet;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hunt.tst.prj.model.Enterprise;
import hunt.tst.prj.model.User;
import hunt.tst.prj.repository.EnterpriseRepository;
import hunt.tst.prj.repository.UserRepository;

@SpringBootApplication
public class TstProject1Application {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EnterpriseRepository enterpriseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TstProject1Application.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	        
	    	User u1=new User("FIO1", LocalDate.now(), "INN1111111", new HashSet<>());
	        User u2=new User("FIO2", LocalDate.now(), "INN2222222", new HashSet<>());
	        User u3=new User("FIO3", LocalDate.now(), "INN3333333", new HashSet<>());
	        User u4=new User("FIO4", LocalDate.now(), "INN4444444", new HashSet<>());
	        User u5=new User("FIO5", LocalDate.now(), "INN5555555", new HashSet<>());
	        	        
	    	u1=userRepository.save(u1);
	    	u2=userRepository.save(u2);
	    	u3=userRepository.save(u3);
	    	u4=userRepository.save(u4);
	    	u5=userRepository.save(u5);
	        
	    	Enterprise entr1=new Enterprise("ENTR11", "EDPRO11", new HashSet<>());
	    	Enterprise entr2=new Enterprise("ENTR22", "EDPRO22", new HashSet<>());
	    	Enterprise entr3=new Enterprise("ENTR33", "EDPRO33", new HashSet<>());
	    		    	
	        entr1=enterpriseRepository.save(entr1);
	        entr2=enterpriseRepository.save(entr2);
	        entr3=enterpriseRepository.save(entr3);
	        
	        entr1.getUsers().add(u1);
	        entr2.getUsers().add(u1);
	        
	        entr1.getUsers().add(u2);
	        entr3.getUsers().add(u2);

	        entr2.getUsers().add(u3);
	        entr3.getUsers().add(u3);

	        entr1.getUsers().add(u4);
	        entr2.getUsers().add(u4);

	        entr1.getUsers().add(u5);
	        entr3.getUsers().add(u5);
	        	        	        
	        enterpriseRepository.save(entr1);
	        enterpriseRepository.save(entr2);
	        enterpriseRepository.save(entr3);
	        
	    };
	}
	
}
