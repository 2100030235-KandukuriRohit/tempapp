package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.repository.CustomerRespository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRespository customerRespository;

	@Override
	public String addCustomer(Customer customer) {
		customerRespository.save(customer);
		return "Registered Successfully";
	}

	@Override
	public Customer checkcuslogin(String email, String password) {
		return customerRespository.checkcuslogin(email, password);
	}
		
	
	
	
	
	
}
