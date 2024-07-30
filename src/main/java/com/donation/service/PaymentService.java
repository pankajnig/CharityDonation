package com.donation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donation.dao.PaymentDao;
import com.donation.model.Payments;

@Service
public class PaymentService {
	
	@Autowired
	public PaymentDao paymentdao;
	
	public String  createPayment(Payments payment) {
		
		try {
		paymentdao.createPaymentDBEntry(payment);;
			
			return "Submitted";	
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			return null;
		}
		

}
