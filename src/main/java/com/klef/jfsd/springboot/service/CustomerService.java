package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Customer;

public interface CustomerService {

	public String addCustomer(Customer customer);
	public Customer checkcuslogin(String email,String password);
}
