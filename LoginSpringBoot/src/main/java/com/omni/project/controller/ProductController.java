package com.omni.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omni.project.entity.Laptops;
import com.omni.project.entity.Mobiles;
import com.omni.project.repository.LaptopsRepo;
import com.omni.project.repository.MobilesRepo;

@Controller
public class ProductController 
{
	
/*	@Autowired
	LaptopsRepo lrepo;
	
	@Autowired
	MobilesRepo mrepo;
	@RequestMapping("/laptops")
	public String lap()
	{
		List<Laptops> laptoplist=new ArrayList<>();
		Laptops l1=new Laptops("lenovo S145", "330s.jpg", 35990);
		Laptops l2=new Laptops("Lenovo 330S", "s145.jpg", 34490);
		laptoplist.add(l1);
		laptoplist.add(l2);
		lrepo.saveAll(laptoplist);
		return "saved";
	}
	
	@RequestMapping("/mobiles")
	public String mbl()
	{
		List<Mobiles> mobilelist=new ArrayList<>();
		Mobiles m1=new Mobiles("Redmi Note8 Pro", "redmi note8 pro.jpg", 15999);
		Mobiles m2=new Mobiles("One Plus 7T", "one plus 7t.jpg", 34999);
		mobilelist.add(m1);
		mobilelist.add(m2);
		mrepo.saveAll(mobilelist);
		return "saved";
	}
	*/
	
}
