package com.hand.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.ssm.dto.Address;
import com.hand.ssm.dto.Customer;
import com.hand.ssm.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/check")
	public String select(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username=" + username);
		System.out.println("customerservice.check(username)=" + customerService.check(username));
		if (customerService.check(username) != null) {
			System.out.println("查询成功");
			request.setAttribute("message", "login");
			return "login";
		} else {
			request.setAttribute("message", "账号或密码错误");
			return "index";
		}
	}

	@ResponseBody
	@RequestMapping("/select2")
	public List<Customer> select2(Map<String, Object> map) {
		System.out.println("select2");
		Customer customer = new Customer();
		int page = 1;
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.select2(customer);
		System.out.println(customers);
		return customers;
	}

	@ResponseBody
	@RequestMapping("/select3")
	public List<Customer> select3(Map<String, Object> map) {
		System.out.println("select3");
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.select3();
		System.out.println(customers);
		return customers;
	}

	@ResponseBody
	@RequestMapping("/select4")
	public List<Customer> select4(Map<String, Object> map) {
		System.out.println("select4");
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.select4();
		System.out.println(customers);
		return customers;
	}

	@RequestMapping("/edit")
	public String edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("edit");
		Customer customer = new Customer();

		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("firstName");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String address = request.getParameter("address_id");
		String address_id = customerService.selectaddress(address);
		System.out.println("address_id="+address_id);
		customer.setCustomer_id(id);
		customer.setAddress_id(Integer.parseInt(address_id));
		customer.setFirst_name(firstName);
		customer.setLast_name(last_name);
		customer.setEmail(email);
		customerService.update(customer);
		//request.getRequestDispatcher("/views/login.jsp").forward(request,response);
		return "index";
	}
	
	@RequestMapping("/add")
	public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("add");
		String firstName = request.getParameter("firstname");
		String last_name = request.getParameter("lastname");
		String email = request.getParameter("lastname");
		String address = request.getParameter("address_id");
		String address_id = customerService.selectaddress(address);
		System.out.println("address_id="+address_id);
		Date date = new Date();
		Date createdate = new Date();
		Customer customer = new Customer();
		customer.setAddress_id(Integer.parseInt(address_id));
		customer.setFirst_name(firstName);
		customer.setLast_name(last_name);
		customer.setEmail(email);
		customer.setActive(1);
		customer.setCreate_date(new Date());
		customer.setLast_update(date);
		customer.setStore_id(1);
		customerService.add(customer);
		request.getRequestDispatcher("views/login.jsp").forward(request,response);
	}

	@ResponseBody
	@RequestMapping("/selectbyid")
	public List<Customer> selectbyid(HttpServletRequest request) {
		System.out.println("selectbyid");
		String id = request.getParameter("customer_id");
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.selectbyid(Integer.parseInt(id));
		System.out.println(customers);
		return customers;
	}

	@ResponseBody
	@RequestMapping("/delete")
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("delete");
		String j = request.getParameter("j");
		customerService.delete(j);
		// int id = Integer.parseInt(j);

		// System.out.println("delete.id="+id);
		/* 执行多条sql语句 */
		/*
		 * customerService.delete0(); customerService.delete(j);
		 * customerService.delete1();
		 */
		// return "check";
		request.getRequestDispatcher("views/login.jsp").forward(request, response);
		
		// return "redirect:/login.jsp";
	}

	@ResponseBody
	@RequestMapping("/editselect")
	public List<Customer> editselect(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("editselect");
		List<Customer> customers = new ArrayList<Customer>();
		String id = request.getParameter("l");
		int l = Integer.parseInt(id);
		customers = customerService.selectbyid(l);
		return customers;
	}

	@ResponseBody
	@RequestMapping("/selectalladdress")
	public List<Address> selectAlladdress(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("selectalladdress");
		List<Address> addresss = new ArrayList<Address>();
		addresss = customerService.selectAlladdress();
		return addresss;
	}

	@ResponseBody
	@RequestMapping("/selectpage")
	public List<Customer> selectpage(HttpServletRequest request, HttpServletResponse response) {
		int page = Integer.parseInt(request.getParameter("id"));
		System.out.println("selectpage");
		Customer customer = new Customer();
		customer.setCursor((page - 1) * 15);
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.selectpage(customer);
		return customers;
	}

}