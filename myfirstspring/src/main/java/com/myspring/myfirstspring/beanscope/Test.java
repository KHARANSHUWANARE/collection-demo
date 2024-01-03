package com.myspring.myfirstspring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/beanscope/config.xml");
		Singleton singleton=(Singleton) applicationContext.getBean("ob");
		System.out.println(singleton.hashCode());
		ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/beanscope/config.xml");
		Singleton singleton2=(Singleton) applicationContext.getBean("ob");
		System.out.println(singleton2.hashCode());
	}

}
