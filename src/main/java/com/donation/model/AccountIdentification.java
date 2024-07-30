package com.donation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountIdentification {
	
	 @JsonProperty("SchemeName") 
	    public String schemeName;
	    @JsonProperty("Identification") 
	    public String identification;
	    @JsonProperty("Name") 
	    public String name;
	    
	    public String getSchemeName() {
			return schemeName;
		}
		public void setSchemeName(String schemeName) {
			this.schemeName = schemeName;
		}
		public String getIdentification() {
			return identification;
		}
		public void setIdentification(String identification) {
			this.identification = identification;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

}
