package com.donation.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

 



 

 public class Root{
    public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
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
	@JsonProperty("Data") 
    public Data data;
    @JsonProperty("Links") 
    public Links links;
    @JsonProperty("Meta") 
    public Meta meta;
}


