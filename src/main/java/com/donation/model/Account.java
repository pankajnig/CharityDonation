package com.donation.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account{
    public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountSubType() {
		return accountSubType;
	}
	public void setAccountSubType(String accountSubType) {
		this.accountSubType = accountSubType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public ArrayList<AccountIdentification> getAccount() {
		return account;
	}
	public void setAccount(ArrayList<AccountIdentification> account) {
		this.account = account;
	}
	
	@JsonProperty("AccountId") 
    public String accountId;
    @JsonProperty("Currency") 
    public String currency;
    @JsonProperty("AccountType") 
    public String accountType;
    @JsonProperty("AccountSubType") 
    public String accountSubType;
    @JsonProperty("Description") 
    public String description;
    @JsonProperty("Nickname") 
    public String nickname;
    @JsonProperty("Account") 
    public ArrayList<AccountIdentification> account;
   
}


