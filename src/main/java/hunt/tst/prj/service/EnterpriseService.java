package hunt.tst.prj.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hunt.tst.prj.model.Enterprise;
import hunt.tst.prj.model.User;
import hunt.tst.prj.model.dto.ChangeJobDTO;
import hunt.tst.prj.repository.EnterpriseRepository;
import hunt.tst.prj.repository.UserRepository;


@Service
public class EnterpriseService {
	
	private final EnterpriseRepository enterpriseRepository;
	private final UserRepository userRepository;
	
	@Autowired
	public EnterpriseService(EnterpriseRepository enterpriseRepository,UserRepository userRepository ) {
		
		this.enterpriseRepository=enterpriseRepository;
		this.userRepository=userRepository;
	}
	
   public Enterprise getEnterprise(String edpro) {
		
	 Enterprise enterprise = this.enterpriseRepository.findByEdrpo(edpro);
	 	 
	 return enterprise;
	 
	} 
   
    public Enterprise addEnterprise(Enterprise enterprise) {
		
    	Enterprise newEntreprise=null;
		try {
			newEntreprise=this.enterpriseRepository.save(enterprise);
		}catch(Exception e) {
			;
		}
    	
		return newEntreprise;
	}
	
	public List<Enterprise> getAll() {
	
		return this.enterpriseRepository.findAll().stream().filter(o->!o.getDeleted()).collect(Collectors.toList());
	}
	
	public User changeEnterprise(ChangeJobDTO dto) {
		
		System.out.println(dto.getInn()+" "+dto.getOldf()+" "+dto.getNewf());
		
		User user=this.userRepository.findByInn(dto.getInn());
		Enterprise oldEnterprise=this.enterpriseRepository.findByEdrpo(dto.getOldf());
		Enterprise newEnterprise=this.enterpriseRepository.findByEdrpo(dto.getNewf());
		
		oldEnterprise.getUsers().remove(user);
		user.getEnterprises().remove(oldEnterprise);
		
		newEnterprise.getUsers().add(user);
		user.getEnterprises().add(newEnterprise);
		
		this.enterpriseRepository.save(oldEnterprise);
		this.enterpriseRepository.save(newEnterprise);
		
		return user;
	}
	
}
