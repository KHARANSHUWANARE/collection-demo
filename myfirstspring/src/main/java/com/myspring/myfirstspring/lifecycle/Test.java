package com.myspring.myfirstspring.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/myspring/myfirstspring/lifecycle/config.xml");
		context.registerShutdownHook();
		Example objectExample =(Example) context.getBean("e1");
		System.out.println(objectExample);
	}

}
