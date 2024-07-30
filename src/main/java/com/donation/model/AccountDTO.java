package com.donation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class AccountDTO {
	
	@JsonProperty("customerId") 
	public String customerId;
	
	@Id
	@JsonProperty("AccountId")
	public String AccountId;
	@JsonProperty("AccountType") 
	public String AccountType;
	@JsonProperty("AccountHolder") 
	public String AccountHolder;
	@JsonProperty("Balance") 
	public String Balance;
	
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	
	
	
	
	

}
