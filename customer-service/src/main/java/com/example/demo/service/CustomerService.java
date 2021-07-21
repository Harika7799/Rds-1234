package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> displayCustomer();
	public Customer getCustomerById(Integer id);
	public Customer updatecustomer(Integer id,Customer customer);
	public String deleteCustomerById(Integer id);

}
