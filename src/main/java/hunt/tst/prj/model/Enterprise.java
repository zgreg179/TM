package hunt.tst.prj.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Enterprise extends BaseModel  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(length=255)
	private String name;
	
	@Column(length=8, unique=true)
	private String edrpo;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "enterprises"})
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Enterprise_User", 
        joinColumns = { @JoinColumn(name = "enterprise_id", referencedColumnName = "ID") }, 
        inverseJoinColumns = { @JoinColumn(name ="user_id" , referencedColumnName = "ID") }
    )
	private Set<User> users = new HashSet<>();
			
	public Enterprise() {
		
		super();
		this.deleted=false;
	}


	public Enterprise(String name, String edrpo, Set<User> users) {
		super();
		this.name = name;
		this.edrpo = edrpo;
		this.users = users;
		this.deleted=false;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEdrpo() {
		return this.edrpo;
	}


	public void setEdrpou(String edrpo) {
		this.edrpo = edrpo;
	}


	public Set<User> getUsers() {
		return users;
	}


	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
