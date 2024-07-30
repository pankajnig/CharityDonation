package com.donation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.donation.model.AccountDTO;
import com.donation.model.Userdetails;

@Repository
public class AccountDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public List<AccountDTO> getAccounts(String customerId) {
		try {
			
			
			System.out.println("inside account dao "+customerId);
			List<AccountDTO> id =  this.hibernateTemplate.loadAll(AccountDTO.class);
			System.out.println(id.get(0).getAccountId());
			//id.getBalance();
		return id;
		}
		catch(Exception e) {
			System.out.println("fetch account details failed");
			e.printStackTrace();
			return null;
		}	
}

}
