package com.springcore.autowiring.xmlbase;

public class Address {

	private String street;
	private String pincode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(String street, String pincode) {
		System.out.println("Argument constructor called..!!!");
		this.street = street;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}

	public Address() {
		System.out.println("No Args Constructor called...!!!");
	}

}
