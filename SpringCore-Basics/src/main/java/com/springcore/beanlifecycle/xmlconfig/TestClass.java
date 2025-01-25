package com.springcore.beanlifecycle.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/beanlifecycle/cmlconfig/XmlConfig.xml");
	
		//calling registerShutdownHook() to call destroy method
 		context.registerShutdownHook();
		
		PersonalData data = (PersonalData) context.getBean("personalData");
		System.out.println("data: " + data);
	}

}
