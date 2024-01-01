package com.myspring.myfirstspring.autowire;

public class Address {
int no;

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

//public Address() {
//	super();
//	// TODO Auto-generated constructor stub
//	System.out.println("address constructor");
//}
public String toString() {
	return "Address [no=" + no + "]";
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int no) {
	super();
	this.no = no;
}

}
