package viss.fiftycorrect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import viss.fiftycorrect.entity.User;
import viss.fiftycorrect.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validLogin(@ModelAttribute("user") User user) {
		System.out.println("tai sao lai the");
//		if(userService.validateUser(user)) System.out.println("true");
//		else System.out.println("false");
		return "home";
	}
	
}
