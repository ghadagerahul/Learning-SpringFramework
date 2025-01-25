package com.springcore.autowiring.xmlbase;

public class Employee {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter method called..!!!");
		this.address = address;
	}

	public Employee(Address address) {
		System.out.println("Args Constructor called...!!!");
		this.address = address;
	}

	public Employee() {
		System.out.println("No args Constructor called:Employee");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
