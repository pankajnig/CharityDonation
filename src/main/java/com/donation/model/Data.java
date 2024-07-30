package com.donation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{
    @JsonProperty("ConsentId") 
    public String consentId;
  
    public String getConsentId() {
		return consentId;
	}
	public void setConsentId(String consentId) {
		this.consentId = consentId;
	}
	public Date getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStatusUpdateDateTime() {
		return statusUpdateDateTime;
	}
	public void setStatusUpdateDateTime(Date statusUpdateDateTime) {
		this.statusUpdateDateTime = statusUpdateDateTime;
	}
	public ArrayList<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(ArrayList<String> permissions) {
		this.permissions = permissions;
	}
	@JsonProperty("CreationDateTime") 
    public Date creationDateTime;
	
	
	@JsonProperty("Account") 
    public List<Account> accountList;
    public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	@JsonProperty("Status") 
    public String status;
    @JsonProperty("StatusUpdateDateTime") 
    public Date statusUpdateDateTime;
    @JsonProperty("Permissions") 
    public ArrayList<String> permissions;
    @JsonProperty("Balance") 
    public ArrayList<Balance> balance;

	public ArrayList<Balance> getBalance() {
		return balance;
	}
	public void setBalance(ArrayList<Balance> balance) {
		this.balance = balance;
	}
}

