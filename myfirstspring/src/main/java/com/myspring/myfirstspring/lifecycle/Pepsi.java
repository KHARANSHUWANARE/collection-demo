package com.myspring.myfirstspring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("pepsi constructor");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pepsi destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pepsi init");
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
}