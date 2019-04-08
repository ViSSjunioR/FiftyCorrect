package viss.fiftycorrect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viss.fiftycorrect.entity.User;
import viss.fiftycorrect.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public boolean validateUser(User user) {
		User userValid = userRepository.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
		if(userValid == null) return false;
		else return true;
		
	}
	
}
