package com.myspring.myfirstspring.lifecycle;

public class Samosa {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		System.out.println("it is constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init() {
		System.out.println("init method");
	}

	public void destory() {
		System.out.println("destory method");
	}

}
