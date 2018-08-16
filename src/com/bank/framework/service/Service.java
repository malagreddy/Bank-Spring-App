package com.bank.framework.service;

import java.util.ArrayList;
import java.util.Set;

import com.bank.framework.account.pojo.BankAccount;
import com.bank.framework.account.pojo.Customer;

public interface Service {

	void addBankAccount(BankAccount bankAccount);
	void addCustomer(Customer customer);
	ArrayList<BankAccount> viewAllAccounts();
	ArrayList<Customer> viewAllCustomers();
	BankAccount searchAccountById(int num);
	boolean FundTransfer(BankAccount sender, BankAccount reciever, double amount);
	

}