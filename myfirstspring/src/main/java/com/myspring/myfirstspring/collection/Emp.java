package com.myspring.myfirstspring.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	String nameString;
	List<Integer> phonesIntegers;
	Set<String> addressSet;
	Map<String, String> coursesMap;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public List<Integer> getPhonesIntegers() {
		return phonesIntegers;
	}
	public void setPhonesIntegers(List<Integer> phonesIntegers) {
		this.phonesIntegers = phonesIntegers;
	}
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<String, String> getCoursesMap() {
		return coursesMap;
	}
	public void setCoursesMap(Map<String, String> coursesMap) {
		this.coursesMap = coursesMap;
	}
	public Emp(String nameString, List<Integer> phonesIntegers, Set<String> addressSet,
			Map<String, String> coursesMap) {
		super();
		this.nameString = nameString;
		this.phonesIntegers = phonesIntegers;
		this.addressSet = addressSet;
		this.coursesMap = coursesMap;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [nameString=" + nameString + ", phonesIntegers=" + phonesIntegers + ", addressSet=" + addressSet
				+ ", coursesMap=" + coursesMap + "]";
	}
	
}
