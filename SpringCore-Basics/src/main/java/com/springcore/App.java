package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// ======== PRIMITIVE DATA INJECT =========
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/xmlConfig/config.xml");

		PremitiveDataBeansInject premitiveDataBeansInject = (PremitiveDataBeansInject) context
				.getBean("premitiveDataBeansInject");

		System.out.println("premitiveDataBeansInject: " + premitiveDataBeansInject);

		// =========== COLLECTIONS INJECT ==========
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"com/springcore/xmlConfig/CollectionsConfig.xml");

		CollectionsBeansInject CcllectionsBeansInject = (CollectionsBeansInject) context1
				.getBean("collectionsBeansInject");

		System.out.println("CcllectionsBeansInject: " + CcllectionsBeansInject);

		// =========== REFERENCE INJECT ==========
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
				"com/springcore/xmlConfig/ReferenceConfig.xml");

		RefrenceinjectionParent refrenceinjectionParent = (RefrenceinjectionParent) context2.getBean("refParent");

		System.err.println("refrenceinjectionParent: " + refrenceinjectionParent);
	}
}
