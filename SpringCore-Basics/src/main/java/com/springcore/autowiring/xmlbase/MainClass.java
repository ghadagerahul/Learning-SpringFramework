package com.springcore.autowiring.xmlbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/xmlbase/config.xml");

		Employee emp = context.getBean("emp", Employee.class);

		System.out.println("emp: " + emp);
	}
}
