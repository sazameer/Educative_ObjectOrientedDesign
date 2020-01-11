package com.zam.libraryMgmtSystem.accounts;

public class Address {
	
	private String doorNumber;
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetAddress=" + streetAddress + ", city=" + city + ", state="
				+ state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	

}
