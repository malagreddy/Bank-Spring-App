package com.bank.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

	@RequestMapping("/viewAllCustomers")
	public String viewAllCustomers() {
		return "viewAllCustomers";
	}

	@RequestMapping("/deposit")
	public String deposit() {
		return "deposit";
	}

	@RequestMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}

	@RequestMapping("/fundTransfer")
	public String fundTransfer() {
		return "fundTransfer";
	}
}
