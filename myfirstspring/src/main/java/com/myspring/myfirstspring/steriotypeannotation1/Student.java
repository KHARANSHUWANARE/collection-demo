package com.myspring.myfirstspring.steriotypeannotation1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("pratik")
	private String nameString;

	@Value("#{arraylist1}")
	private ArrayList namesArrayList;
	public String getNameString() {
		return nameString;
	}
	public ArrayList getNamesArrayList() {
		return namesArrayList;
	}
	public void setNamesArrayList(ArrayList namesArrayList) {
		this.namesArrayList = namesArrayList;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", namesArrayList=" + namesArrayList + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
