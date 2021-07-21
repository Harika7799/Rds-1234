package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerRepository customerRepo;
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}


	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> displayCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}


	@Override
	public Customer getCustomerById(Integer id) {
		Customer c1=customerRepo.findById(id).get();
		if(c1==null)
		{
	       throw new CustomerNotFoundException("Customer not found whith this id");
		}
		return c1;
	}


	@Override
	public Customer updatecustomer(Integer id, Customer customer) {
		Customer c1=customerRepo.findById(id).get();
		if(c1==null)
		{
	       throw new CustomerNotFoundException("Customer not found whith this id");
		}
		c1.setId(customer.getId());
		c1.setFirstName(customer.getFirstName());
		c1.setAddress(customer.getAddress());
		return c1;
	}


	@Override
	public String deleteCustomerById(Integer id) {
		customerRepo.deleteById(id);
		return "Deleted Succesfully";
	}

}
