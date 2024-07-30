package com.donation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.donation.model.Payments;

@Repository
public class PaymentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void createPaymentDBEntry(Payments payment) {
		try {
			
			 this.hibernateTemplate.save(payment);
			System.out.println("payment entry updated");
			//id.getBalance();
				}
		catch(Exception e) {
			System.out.println("fetch account details failed");
			e.printStackTrace();
		}	
}


}
