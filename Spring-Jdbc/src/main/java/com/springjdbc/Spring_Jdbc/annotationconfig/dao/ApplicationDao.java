package com.springjdbc.Spring_Jdbc.annotationconfig.dao;

import com.springjdbc.Spring_Jdbc.annotationconfig.Employee_Detatails;

public interface ApplicationDao {

	
	
	public int insertEmpData(Employee_Detatails employee_Detatails);

	public int updateEmpData(Employee_Detatails employee_Detatails, int id);

	public int deleteEmpData(int id);

}
