package com.bank.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/viewAllCustomers")
	public String viewAllCustomers() {
		return "viewAllCustomers";
	}

}
