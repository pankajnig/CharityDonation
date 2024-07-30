package com.donation.model;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
 
 class Links{
    @JsonProperty("Self") 
    public String self;
}

 class Meta{
    @JsonProperty("TotalPages") 
    public int totalPages;
}

 class Risk{
}

public class ConsentResponse{
    @JsonProperty("Data") 
    public Data data;
    @JsonProperty("Risk") 
    public Risk risk;
    @JsonProperty("Links") 
    public Links links;
    public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Risk getRisk() {
		return risk;
	}
	public void setRisk(Risk risk) {
		this.risk = risk;
	}
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	@JsonProperty("Meta") 
    public Meta meta;
}

