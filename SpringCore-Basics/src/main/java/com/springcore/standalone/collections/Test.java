package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/StansAloneConfig.xml");

		Education education1 = context.getBean("education1", Education.class);
		System.out.println("subjects :" + education1.getSubjects());
		System.out.println("subjects :" + education1.getSubjects().getClass().getName());
		System.out.println("_________________________________________________________________");

		Education education2 = context.getBean("education2", Education.class);
		System.out.println("Departments: " + education2.getDepartments());
		System.out.println("Departments: " + education2.getDepartments().getClass().getName());
		System.out.println("_________________________________________________________________");

		Education education3 = context.getBean("education3", Education.class);
		System.out.println("Courses: " + education3.getFeesForCourses());
		System.out.println("Courses: " + education3.getFeesForCourses().getClass().getName());
		System.out.println("_________________________________________________________________");

		Education education4 = context.getBean("education4", Education.class);
		System.out.println("Properties: " + education4.getProps());
		System.out.println("Properties: " + education4.getProps().getClass().getName());

	}

}
