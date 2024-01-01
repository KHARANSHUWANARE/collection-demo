package com.myspring.myfirstspring;

public class Student {
private int studentid;
private String nameString;
private String addressString;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getNameString() {
	return nameString;
}
public void setNameString(String nameString) {
	this.nameString = nameString;
}
public String getAddressString() {
	return addressString;
}
public void setAddressString(String addressString) {
	this.addressString = addressString;
}
public Student(int studentid, String nameString, String addressString) {
	super();
	this.studentid = studentid;
	this.nameString = nameString;
	this.addressString = addressString;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", nameString=" + nameString + ", addressString=" + addressString + "]";
}

}
