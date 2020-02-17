package com.springboot.Dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.Entity.Person;
import com.springboot.Repository.PersonRepo;
import com.springboot.Repository.PersonRepoImpl;

public class PersonDaoImpl implements PersonDao {

	@Autowired
	PersonRepoImpl personRepo;
	
	@Override
	public String savePersonDetails(Person person)
	{
		personRepo.saveDetails(person);
		return "Successful";
	}

}
