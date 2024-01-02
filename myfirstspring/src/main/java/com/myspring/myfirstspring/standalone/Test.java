package com.myspring.myfirstspring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/standalone/config.xml");
		Person person=(Person) applicationContext.getBean("person1");
		System.out.println(person);
		System.out.println(person.getFriendList().getClass().getName());
		
		System.out.println("  -                  -                      -");
		
		System.out.println(person.getFessMap());
		
		System.out.println(person.getFessMap().getClass().getName());
	}

}
