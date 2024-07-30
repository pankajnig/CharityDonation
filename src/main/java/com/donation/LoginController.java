package com.donation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.donation.model.*;
import com.donation.service.AccountService;
import com.donation.service.LoginService;
import com.donation.service.PaymentService;

@Controller
public class LoginController{
	
	public static String fromAccountNumber;
	
	@Autowired
	public LoginService loginService;
	
	@Autowired
	public AccountService accountService;
	
	@Autowired
	public PaymentService paymentService;
	
	
	@RequestMapping(value="/Login", method = RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute Userdetails userdetails,Model model) {
		
			System.out.println(userdetails.getCustomerId());
			String name = loginService.validateUser(userdetails);
			
			if(!name.equals("LoginError")) {
				try {
			
		ModelAndView modelAndView = new ModelAndView();
		
		
		
		List<AccountDTO> accountDto = accountService.getAccountDetails(userdetails.getCustomerId());
		System.out.print(accountDto.get(0));
		
		
		
		
		
		  List<AccountDetails> accountList;
		  
		  accountList = loginService.getAccountDetails();
		  modelAndView.addObject("accountList",accountList);
		  modelAndView.addObject("accountListSize",accountList.size());
		  System.out.println(accountList.get(0));
		  System.out.println(accountList.size());
		 
		//modelAndView.addObject("accountList",accountDto);
			
			modelAndView.setViewName("selectaccount");
			
			return modelAndView;
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			}
			
		else{
			ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("LoginError");
			
			return modelAndView;
		}
			return null;
		
	}
	
	@RequestMapping(value="/selectaccount", method = RequestMethod.POST)
	public String Home(@RequestBody String request) {
	
		ModelAndView modelAndView = new ModelAndView();
		fromAccountNumber = request;
		//modelAndView.addObject("login","jhjhg");
		//modelAndView.setViewName("Home");
		System.out.println(request);
		System.out.println("inside select account controller");
		
		return "index";
	}
	
	@RequestMapping(value="/makepayment", method = RequestMethod.POST)
	public ModelAndView makePayment(String request) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(request);
		System.out.println(fromAccountNumber);
		modelAndView.addObject("fromAccount",fromAccountNumber);
		modelAndView.addObject("charity1",getCharityRecom().get(0));
		modelAndView.addObject("charity2",getCharityRecom().get(1));
		modelAndView.addObject("charity3",getCharityRecom().get(2));
		modelAndView.addObject("charity4",getCharityRecom().get(3));
		modelAndView.addObject("charity5",getCharityRecom().get(4));
		modelAndView.setViewName("paymentsetupscreen");
		return modelAndView;
	}
	
	@RequestMapping(value="/selectpaymenttype", method = RequestMethod.POST)
	public ModelAndView selectPaymentType(String request) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(request);
		System.out.println(fromAccountNumber);
		modelAndView.addObject("fromAccount",fromAccountNumber);
		modelAndView.setViewName("selectPaymentType");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/submitpayment", method = RequestMethod.POST)
	public ModelAndView submitPayment(@ModelAttribute Payments payment) {
		ModelAndView modelAndView = new ModelAndView();
		payment.setPaymentId(ThreadLocalRandom.current().nextInt());
		payment.setPaymentType("FP");
		System.out.println(payment.getToAccount());
		String view = paymentService.createPayment(payment);
		modelAndView.setViewName("submitted");
		return modelAndView;
	}
	
	
	
	public List<String> getCharityRecom(){
		
		List<String> charityList = new ArrayList<String>();
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "THE CHARITIES AID FOUNDATIOM");
		map.put(2, "LLOYD'S REGISTER FOUNDATION");
		map.put(3, "NUFFIELD HEALTH");
		map.put(4, "SAVE THE CHILDEREN INTERNATIONAL");
		map.put(5, "THE ARTS COUNCIL OF ENGLAND");
		map.put(6, "THE BRITISH COUNCIL");
		map.put(7, "CANCER RESEARCH UK");
		map.put(8, "CARDIFF UNIVERSITY");
		map.put(9, "IIMMUNIDSATION COMPANY");
		map.put(10, "BRITISH HEART FOUNDATION");
		map.put(11, "WWF");
		map.put(12, "NSPCC");
		map.put(13, "BRITISH RED CROSS");
		map.put(14, "NATIONAL TRUST");
		map.put(15, "RSPCA");
		map.put(16, "DEMENTIA UK");
		map.put(17, "ROYAL BRITISH LEGION");
		map.put(18, "RNLI LEFEBOATS");
		
		for(int i=1;i<6;i++) {
			 Random random = new Random();
		        // generate random number from 0 to 3
		        int number = random.nextInt(18);
			
			charityList.add(map.get(number));
		}
		
		return charityList;
		
		}
	
	
	
	
	
}