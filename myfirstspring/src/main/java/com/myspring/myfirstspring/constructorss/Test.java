package com.myspring.myfirstspring.constructorss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext obj1=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/constructorss/config.xml");
		Person objPerson1=(Person) obj1.getBean("person1");
		System.out.println(objPerson1);
		Addition objAddition=(Addition) obj1.getBean("addition");
	}

}
