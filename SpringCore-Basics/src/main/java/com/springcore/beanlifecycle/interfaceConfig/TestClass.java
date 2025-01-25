package com.springcore.beanlifecycle.interfaceConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/beanlifecycle/interfaceConfig/config.xml");

		PersonalData1 data = (PersonalData1) context.getBean("personalData1");

		System.out.println("data: " + data);
	}

}
