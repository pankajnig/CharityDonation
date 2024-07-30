package com.donation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetails {
	
	@JsonProperty("AccountId")
	public String accountId;
	@JsonProperty("Nickname")
	public String nickname;
	@JsonProperty("AccountType")
	public String accountType;
	@JsonProperty("Balance")
	public String balance;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	

}
