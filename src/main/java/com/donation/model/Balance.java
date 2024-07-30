package com.donation.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Balance{
    public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCreditDebitIndicator() {
		return creditDebitIndicator;
	}
	public void setCreditDebitIndicator(String creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	@JsonProperty("AccountId") 
    public String accountId;
    @JsonProperty("CreditDebitIndicator") 
    public String creditDebitIndicator;
    @JsonProperty("Type") 
    public String type;
    @JsonProperty("DateTime") 
    public Date dateTime;
    @JsonProperty("Amount") 
    public Amount amount;
    
    
    
}