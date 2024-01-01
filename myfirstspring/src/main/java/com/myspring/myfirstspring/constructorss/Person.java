package com.myspring.myfirstspring.constructorss;

public class Person {
private int pid;
private String pnameString;
private Person2 objPerson2;
public Person(int pid, String pnameString, Person2 objPerson2) {
	super();
	this.pid = pid;
	this.pnameString = pnameString;
	this.objPerson2 = objPerson2;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", pnameString=" + pnameString + ", objPerson2=" + objPerson2 + "]";
}



}