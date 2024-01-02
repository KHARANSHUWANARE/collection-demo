package com.myspring.myfirstspring.steriotypeannotation1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/myspring/myfirstspring/steriotypeannotation1/config.xml");
	Student student=(Student) applicationContext.getBean("student");
	System.out.println(student);
	

}
}
