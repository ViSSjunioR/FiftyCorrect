package viss.fiftycorrect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import viss.fiftycorrect.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	public User findUserByUsernameAndPassword(String username,String password); 
}
