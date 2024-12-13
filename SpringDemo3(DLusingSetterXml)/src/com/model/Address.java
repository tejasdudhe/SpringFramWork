package com.model;

public class Address 
{
  String city;
  String state;
  String addressline;
  public Address() 
  {
	super();
  }
  public Address(String city, String state, String addressline) 
  {
	super();
	this.city = city;
	this.state = state;
	this.addressline = addressline;
 }
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getAddressline() {
	return addressline;
}
public void setAddressline(String addressline) {
	this.addressline = addressline;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", addressline=" + addressline + "]";
}
  
}
