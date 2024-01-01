package com.myspring.myfirstspring.autowire;

public class Emp {
Address objectAddress;

public Address getObjectAddress() {
	return objectAddress;
}

public void setObjectAddress(Address objectAddress) {
	this.objectAddress = objectAddress;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("emp constructor");
}

public String toString() {
	return "Emp [objectAddress=" + objectAddress + "]";
}

public Emp(Address objectAddress) {
	super();
	this.objectAddress = objectAddress;
}



}
