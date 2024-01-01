package com.myspring.myfirstspring.autowire.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/autowire/qualifier/config.xml");
	Emp objectEmp1=(Emp) context.getBean("emp1");
	System.out.println(objectEmp1);
}
}
