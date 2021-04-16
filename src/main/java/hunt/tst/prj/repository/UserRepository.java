package hunt.tst.prj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hunt.tst.prj.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByInn(String inn);
}
