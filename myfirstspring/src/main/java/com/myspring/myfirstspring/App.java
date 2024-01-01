package com.myspring.myfirstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     ApplicationContext context  =  new ClassPathXmlApplicationContext("config.xml");
     Student xStudent=(Student) context.getBean("student1");
     Student xStudent2=(Student) context.getBean("student2");
     System.out.println(xStudent2);
     System.out.println(xStudent);
    }
}
