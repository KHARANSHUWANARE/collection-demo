package com.myspring.myfirstspring.autowire.qualifier;

public class Address {
int no;

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

@Override
public String toString() {
	return "Address [no=" + no + "]";
}

public Address(int no) {
	super();
	this.no = no;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}
