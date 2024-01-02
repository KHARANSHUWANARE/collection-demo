package com.myspring.myfirstspring.steriotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/myfirstspring/src/main/java/com/myspring/myfirstspring/steriotypeannotation/config.xml");
	
	Student student=(Student) applicationContext.getBean("student");
	System.out.println(student);
}
}
