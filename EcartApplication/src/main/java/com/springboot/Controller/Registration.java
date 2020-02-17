package com.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.Entity.Person;
import com.springboot.Service.PersonService;

@Controller
public class Registration {

	
	@Autowired
	Person person;
	
	@Autowired
	PersonService pservice;
	
	@RequestMapping("/register")
	public String register(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("emailid") String email,
			@RequestParam("mobileno") long mobile,@RequestParam("username") String uname,@RequestParam("password") String pwd)
	{
		person.setFirstname(fname);
		person.setLastname(lname);
		person.setEmailid(email);
		person.setMobileno(mobile);
		person.setUsername(uname);
		person.setPassword(pwd);
		
		return pservice.addPayee(person);
		
	}
}
