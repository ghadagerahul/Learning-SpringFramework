package com.springcore.beanlifecycle.annotationconfig;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClass {

	public static void main(String[] args) {

		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/beanlifecycle/annotationconfig/config.xml");

		context.registerShutdownHook();

		EntityClass calss = (EntityClass) context.getBean("entityClass");

		System.out.println("calss: " + calss);

	}
		
	  public static boolean isValidIndianPincode(String pincode) {
	        // Regular expression for Indian Pincode (6 digits and first digit not 0)
	        String regex = "^[1-9][0-9]{5}$";
	        
	        // Compile the regular expression
	        Pattern pattern = Pattern.compile(regex);
	        
	        // Match the input string with the regular expression
	        Matcher matcher = pattern.matcher(pincode);
	        
	        // Return whether the pincode matches the pattern
	        return matcher.matches();
	    }

}
