package com.springboot.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springboot.Entity.Person;
@Repository
public class PersonRepoImpl implements PersonRepo {

	@Override
	public String saveDetails(Person person)
	{
		Configuration con=new Configuration().configure().addAnnotatedClass(Person.class);
        //ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(person);
         tx.commit();
		return "Added Successfully";
	}

}
