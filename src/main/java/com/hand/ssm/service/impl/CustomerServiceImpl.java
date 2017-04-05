package com.hand.ssm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.ssm.dto.Address;
import com.hand.ssm.dto.Customer;
import com.hand.ssm.mapper.CustomerMapper;
import com.hand.ssm.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	 @Autowired
	 private CustomerMapper customerMapper;
	 

	public String check(String username) {
		return customerMapper.check(username);
	}


	public List<Customer> select2(Customer customer) {
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerMapper.select2(customer);
		return customers;
	}


	public List<Customer> select3() {
		List<Customer> customers = customerMapper.select3();
		return customers;
	}


	public List<Customer> select4() {
		List<Customer> customers = customerMapper.select4();
		return customers;
	}


	public void delete(String id) {
		customerMapper.delete(id);
	}


	public List<Customer> selectpage(Customer customer) {
		return customerMapper.selectpage(customer);
	}


	public void delete0() {
		customerMapper.delete0();
	}


	public void delete1() {
		customerMapper.delete1();
	}


	public List<Customer> selectbyid(int id) {
		List<Customer> customers = customerMapper.selectbyid(id);
		return customers;
	}


	public List<Address> selectAlladdress() {
		// TODO Auto-generated method stub
		List<Address> lists = customerMapper.selectAlladdress();
		return lists;
	}


	public String selectaddress(String address) {
		// TODO Auto-generated method stub
		String a = customerMapper.selectaddress(address);
		return a;
	}


	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.update(customer);
	}


	public void add(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.add(customer);
	}

}
