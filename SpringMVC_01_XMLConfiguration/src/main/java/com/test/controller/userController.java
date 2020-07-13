package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class userController {

	@RequestMapping(value = "/newuser", method = RequestMethod.GET)
	public String newUser(Model model) {
		System.out.println("=====>> I am in newUser method of user controller");
		model.addAttribute("User",new User());
		return "userForm";
	}
	
}
