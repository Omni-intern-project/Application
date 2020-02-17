package com.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Dao.PersonDao;
import com.springboot.Entity.Person;
import com.springboot.Repository.PersonRepo;

@Service
public class PersonServiceImpl implements PersonService {

	/*
	 * @Autowired PersonDao pdao;
	 */
	
	@Autowired 
	PersonRepo prepo;
	@Override
	public String addPayee(Person person)
	{
		
		return prepo.saveDetails(person);
	}

}
