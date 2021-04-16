package hunt.tst.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hunt.tst.prj.model.Enterprise;


public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

	public Enterprise findByEdrpo(String edpro);
	

}
