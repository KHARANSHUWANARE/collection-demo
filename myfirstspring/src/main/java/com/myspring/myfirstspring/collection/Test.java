package com.myspring.myfirstspring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext xApplicationContext=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/collection/config.xml");
		Emp object1=(Emp) xApplicationContext.getBean("employee1");
		System.out.println(object1);
	}

}
