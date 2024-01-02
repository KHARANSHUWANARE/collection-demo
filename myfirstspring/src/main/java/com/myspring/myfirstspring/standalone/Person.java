package com.myspring.myfirstspring.standalone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Person {
	private List friendList;
	private Map<String, Integer> fessMap;
	public List getFriendList() {
		return friendList;
	}

	public Map<String, Integer> getFessMap() {
		return fessMap;
	}

	public void setFessMap(Map<String, Integer> fessMap) {
		this.fessMap = fessMap;
	}

	public void setFriendList(List friendList) {
		this.friendList = friendList;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friendList=" + friendList + ", fessMap=" + fessMap + "]";
	}
	
}
