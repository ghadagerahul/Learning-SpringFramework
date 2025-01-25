package com.springjdbc.Spring_Jdbc.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.Spring_Jdbc.annotationconfig.dao.ApplicationDao;
import com.springjdbc.Spring_Jdbc.annotationconfig.daoImpl.ApplicationDaoImpl;

@Configuration
public class JavaConfig {

	@Bean("ds")
	public DriverManagerDataSource getDriverManagerDataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("Hornet@2024");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDriverManagerDataSource());
		return jdbcTemplate;
	}

	@Bean("applicationDao")
	public ApplicationDao getApplicationDao() {

		ApplicationDao applicationDao = new ApplicationDaoImpl();

		return applicationDao;

	}

}
