package com.springjdbc.Spring_Jdbc.annotationconfig.daoImpl;

import java.net.IDN;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.Spring_Jdbc.annotationconfig.Employee_Detatails;
import com.springjdbc.Spring_Jdbc.annotationconfig.dao.ApplicationDao;

public class ApplicationDaoImpl implements ApplicationDao {

	JdbcTemplate jdbcTemplate;

	public ApplicationDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public ApplicationDaoImpl() {

	}

	@Override
	public int insertEmpData(Employee_Detatails employee_Detatails) {

		String query = "INSERT INTO EMPLOYEE_DETAILS (ENAME, EDESIGNATION, ESALARY, ECOMPTYP, ECOMPNAME)\r\n"
				+ "VALUES (?,?,?,?,?)";

		int count = jdbcTemplate.update(query, employee_Detatails.geteName(), employee_Detatails.geteDesignation(),
				employee_Detatails.geteSalary(), employee_Detatails.geteCompanyTyp(),
				employee_Detatails.geteCompanyName());

		return count;
	}

	@Override
	public int updateEmpData(Employee_Detatails employee_Detatails, int id) {

		String query = "UPDATE EMPLOYEE_DETAILS SET ENAME=?, EDESIGNATION=?, ESALARY=?, ECOMPTYP=?, ECOMPNAME=? WHERE EID=?";

		int count = jdbcTemplate.update(query, employee_Detatails.geteName(), employee_Detatails.geteDesignation(),
				employee_Detatails.geteSalary(), employee_Detatails.geteCompanyTyp(),
				employee_Detatails.geteCompanyName(), id);

		return count;
	}

	@Override
	public int deleteEmpData(int id) {

		String query = "DELETE FROM EMPLOYEE_DETAILS WHERE EID=?";

		int count = jdbcTemplate.update(query, id);

		return count;
	}

}
