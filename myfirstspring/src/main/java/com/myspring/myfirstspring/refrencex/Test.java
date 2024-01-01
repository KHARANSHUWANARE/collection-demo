package com.myspring.myfirstspring.refrencex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/myspring/myfirstspring/refrencex/config.xml");
		Object objA = context.getBean("aref");
		System.out.println(objA);
	}

}
