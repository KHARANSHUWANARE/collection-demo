package com.myspring.myfirstspring.steriotypeannotation;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("student")
public class Student {
@Value("pratik")
private String studentnameString;
@Value("pune")
private String cityString;


public String getStudentnameString() {
	return studentnameString;
}
public void setStudentnameString(String studentnameString) {
	this.studentnameString = studentnameString;
}
public String getCityString() {
	return cityString;
}
public void setCityString(String cityString) {
	this.cityString = cityString;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentnameString=" + studentnameString + ", cityString=" + cityString + "]";
}


}
