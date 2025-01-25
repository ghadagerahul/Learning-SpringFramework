package com.springjdbc.Spring_Jdbc.annotationconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.Spring_Jdbc.annotationconfig.dao.ApplicationDao;
import com.springjdbc.Spring_Jdbc.annotationconfig.daoImpl.ApplicationDaoImpl;

public class DemoClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				JavaConfig.class);

		JdbcTemplate jdbcTemplate = annotationConfigApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

		ApplicationDao applicationDao = new ApplicationDaoImpl(jdbcTemplate);

		System.out.println("jdbcTemplate: " + jdbcTemplate);

		System.out.println("applicationDao: " + applicationDao);

		Employee_Detatails employee = new Employee_Detatails();
		employee.seteName("Raj");
		employee.seteDesignation("Software Developer");
		employee.seteSalary(100000000.27);
		employee.seteCompanyTyp("Private");
		employee.seteCompanyName("IT SOLUTIONS");

		int count = 0;

		// count= applicationDao.insertEmpData(employee);
		// count = applicationDao.updateEmpData(employee, 2);
		count = applicationDao.deleteEmpData(2);
		System.out.println("=============== count: " + count);
	}

}
