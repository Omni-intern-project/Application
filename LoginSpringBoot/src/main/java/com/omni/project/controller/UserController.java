package com.omni.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.omni.project.entity.User;
import com.omni.project.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	 
	@RequestMapping("/ecommerce")
	public ModelAndView display() {
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@PostMapping("/register")
	public ModelAndView register(@RequestParam("firstname") String fname,
						@RequestParam("lastname") String lname,
						@RequestParam("emailid") String email,
						@RequestParam("mobileno") long mobile,
						@RequestParam("username") String uname,
						@RequestParam("password") String pass) {
		
		User user= new User(fname, lname, email, mobile, uname, pass);
		ModelAndView mv=new ModelAndView();
		
		userService.register(user);
		mv.setViewName("index");
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam("username") String uname,@RequestParam("password") String pass, HttpServletRequest req) {
		
		HttpSession httpSession = req.getSession();
	
		ModelAndView mv=new ModelAndView();
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		List<User> user= session.createQuery("from user U where U.username = '"+uname+"' and password = '"+pass+"'").getResultList();
		session.getTransaction().commit();
		for (User user2 : user) {
			System.out.println(user2);
		}
		if(user!=null && user.size()>0) {
			mv.addObject("uname",uname);
			mv.setViewName("home");
			Long id=user.get(0).getId();
			httpSession.setAttribute("id", id);
			return mv;
			
		}
		else {
		String errmsg="Enter Correct Username And Password";
		mv.addObject("errmsg",errmsg);
		mv.setViewName("index");
		return mv;
		}
	}

	@PostMapping("/deleteuser")
	public String deleteuser(HttpServletRequest req) {
		HttpSession session=req.getSession();
		Long id=(Long) session.getAttribute("id");
		userService.deleteUser(id);
		return "Deleted";
		
	}
	
	@PostMapping("/updateDetails")
	public ModelAndView updateUser(@RequestParam("username") String uname,@RequestParam("password") String pass) {
		
		ModelAndView mv= new ModelAndView();

		return mv;
	}
	
	@RequestMapping("/updatedetails")
	public void update(@RequestParam("firstname") String fname,
			@RequestParam("lastname") String lname,
			@RequestParam("emailid") String email,
			@RequestParam("mobileno") long mobile,
			@RequestParam("username") String uname,
			@RequestParam("password") String pass,HttpServletRequest req) {
		User user=new User(fname, lname, email, mobile, uname, pass);
		HttpSession session=req.getSession();
		Long id= (Long) session.getAttribute("id");
		userService.updateUser(user,id);	
	}
	@RequestMapping("/userslist")
	public List<User> usersList(){
		List<User> users= userService.listUsers();
		return users;
	}
}
