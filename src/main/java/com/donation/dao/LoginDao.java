package com.donation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.donation.model.Userdetails;


@Repository
public class LoginDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public Userdetails getUser(String customerId) {
		try {
		Userdetails id =  this.hibernateTemplate.get(Userdetails.class,customerId);
	   id.getPassword();
		return id;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("incorrect credentials");
			return null;
		}	
}

}
