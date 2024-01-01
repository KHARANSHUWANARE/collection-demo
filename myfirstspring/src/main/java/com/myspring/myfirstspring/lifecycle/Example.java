package com.myspring.myfirstspring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("example constructor");
}

@Override
public String toString() {
	return "Example [price=" + price + "]";
}

@PostConstruct
public void start()
{
	System.out.println("init method example");
}
@PreDestroy
public void end() {
	System.out.println("destory method example");
}
}
