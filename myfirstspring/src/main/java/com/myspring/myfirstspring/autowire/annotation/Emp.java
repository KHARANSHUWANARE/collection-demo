package com.myspring.myfirstspring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address1;

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	public Emp(Address address1) {
		super();
		this.address1 = address1;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address1=" + address1 + "]";
	}
	
	
	
}
