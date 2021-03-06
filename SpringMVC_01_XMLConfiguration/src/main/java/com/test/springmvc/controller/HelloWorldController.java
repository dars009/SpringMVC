package com.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello World from Spring 4 MVC");
		return "welcome-page";
	}

}
