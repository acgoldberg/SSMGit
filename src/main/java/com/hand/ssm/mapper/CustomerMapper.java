package com.hand.ssm.mapper;

import java.util.List;

import com.hand.ssm.dto.Address;
import com.hand.ssm.dto.Customer;
import com.hand.ssm.dto.Film;
/*与CustomerMapper.xml 方法对应*/
public interface CustomerMapper {
	public List<Customer> select2(Customer customer);
	public List<Customer> selectbyid(int id);
	public List<Customer> select3();
	public List<Customer> select4();
    public String check(String username);
    public void delete0();
    public void delete(String id);
    public void delete1();
    public List<Customer> selectpage(Customer customer); 
    public List<Address> selectAlladdress();
    public String selectidbyname(String address);
    public String selectaddress(String address);
    public void update(Customer customer);
    public void add(Customer customer);
}
