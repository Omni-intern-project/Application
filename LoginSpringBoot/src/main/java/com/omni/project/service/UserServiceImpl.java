package com.omni.project.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omni.project.entity.User;
import com.omni.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	public void register(User user) {
		
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(Long id) {
		
		userRepository.deleteById(id);;
		
	}

	@Override
	public List<User> listUsers() {
		List<User> users=userRepository.findAll();
		return users;
	}

	@Override
	public void updateUser(User user, Long id) {
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		System.out.println("User Updated");
		
	}

	

}
