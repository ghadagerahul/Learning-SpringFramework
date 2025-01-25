package com.springjdbc.Spring_Jdbc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.Spring_Jdbc.xmlconfig.repo.JdbcDao;
import com.springjdbc.Spring_Jdbc.xmlconfig.repoImpl.JdbcDaoImpl;

public class DemoClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springjdbc/Spring_Jdbc/xmlconfig/jdbcconfig.xml");

		Bike_Details ds = new Bike_Details();

		
//		ds.setBikeNmae("Platina");
//		ds.setBikeNumber("MH 45 x 3113");
//		ds.setBikeOwnerContactNo("7028011009");
//		ds.setBikeOwnerName("Pashant");
//		ds.setBikeModel("Old 100CC");

		ds.setBikeNmae("Hornet");
		ds.setBikeNumber("MH 45 x 5678");
		ds.setBikeOwnerContactNo("9876543210");
		ds.setBikeOwnerName("Rahul");
		ds.setBikeModel("2024");

		JdbcTemplate jdbcTemplate = context.getBean("jdbctemplate", JdbcTemplate.class);

		JdbcDao dao = new JdbcDaoImpl(jdbcTemplate);
		
		int numbers = 0;

		numbers = dao.insert(ds);
		
		//numbers = dao.update(ds,2);
		
		System.out.println("numbers: " + numbers);
	}

}
