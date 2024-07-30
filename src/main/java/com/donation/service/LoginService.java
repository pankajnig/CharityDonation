package com.donation.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.donation.dao.LoginDao;
import com.donation.model.Account;
import com.donation.model.AccountDetails;
import com.donation.model.Balance;
import com.donation.model.TokenResponse;
import com.donation.model.Userdetails;

@Service
public class LoginService {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	LoginDao logindao;
	
	public List<AccountDetails> getAccountDetails() throws JSONException {
		
		Userdetails us = logindao.getUser("123456");
		System.out.println(us.getPassword());
		
		List<AccountDetails> adList =  new ArrayList<AccountDetails>();
		
		String token = accountService.getToken();
		String consentId = accountService.getConsent(token);
		String consentCode = accountService.approveConsent(consentId);
		String refreshtoken = accountService.getRefreshToken(consentCode);
		List<Account> accountList = accountService.getAccounts(refreshtoken);
		
		for(int i=0;i<accountList.size();i++) {
			AccountDetails ad = new AccountDetails();
			 ad.setAccountId(accountList.get(i).getAccount().get(0).getIdentification());
			 ad.setAccountType(accountList.get(i).getAccountType());
			 ad.setNickname(accountList.get(i).getNickname());
			 List<Balance> balanceList = accountService.getBalances(refreshtoken,accountList.get(i).getAccountId());
			 ad.setBalance(balanceList.get(1).getAmount().getAmount().toString());
			 adList.add(ad);
		}
		return adList;
	}
	
	public String validateUser(Userdetails userdetails) {
		
		Userdetails us = logindao.getUser(userdetails.getCustomerId());
		if(us!= null) {
		if(userdetails.getPassword().equals(us.getPassword())) {
			System.out.println(userdetails.getCustomerId()+" Logged in successfully");
			return "sfd";
		}
		
	}
		else {
		return "LoginError";
		}
		return "LoginError";
	}
	
	
}
