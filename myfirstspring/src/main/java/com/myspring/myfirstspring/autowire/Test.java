package com.myspring.myfirstspring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext objectApplicationContext=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/autowire/config.xml");
		Emp objEmp=(Emp) objectApplicationContext.getBean("emp1");
		System.out.println(objEmp);
	}

}
