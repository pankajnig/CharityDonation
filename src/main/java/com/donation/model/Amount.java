package com.donation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amount{
    @JsonProperty("Amount") 
    public String amount;
    @JsonProperty("Currency") 
    public String currency;
    
    
    public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
