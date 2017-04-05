package com.hand.ssm.service;

import java.util.List;

import com.hand.ssm.dto.Address;
import com.hand.ssm.dto.Customer;



public interface CustomerService {
    public String check(String username);
    public List<Customer> select2(Customer customer);
    public List<Customer> select3();
    public List<Customer> select4();
    public void delete(String id);
    public void delete0();
    public void delete1();
    public List<Customer> selectpage(Customer customer);
    public List<Customer> selectbyid(int id);
    public List<Address> selectAlladdress();
    public String selectaddress(String address);
    public void update(Customer customer);
    public void add(Customer customer);
}
