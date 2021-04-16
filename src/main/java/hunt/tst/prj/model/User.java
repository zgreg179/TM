package hunt.tst.prj.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import hunt.tst.prj.util.JpaLocalDateConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class User extends BaseModel  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(length=255)
	private String fio;
	
	@Convert(converter = JpaLocalDateConverter.class)
	private LocalDate birthDate;
	
	@Column(length=10, unique=true)
	private String inn;
	
		
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "users"})
	@ManyToMany(fetch = FetchType.LAZY,
                cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "users")
    Set<Enterprise> enterprises = new HashSet<>();
	
		
	public User() {
		super();
		this.deleted=false;
	}


	public User(String fio, LocalDate birthDate, String inn, Set<Enterprise> enterprises) {
		
		super();
		this.fio = fio;
		this.birthDate = birthDate;
		this.inn = inn;
		this.enterprises = enterprises;
		this.deleted=false;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFio() {
		return fio;
	}


	public void setFio(String fio) {
		this.fio = fio;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public String getInn() {
		return inn;
	}


	public void setInn(String inn) {
		this.inn = inn;
	}


	public Set<Enterprise> getEnterprises() {
		return enterprises;
	}


	public void setEnterprises(Set<Enterprise> enterprises) {
		this.enterprises = enterprises;
	}
}
