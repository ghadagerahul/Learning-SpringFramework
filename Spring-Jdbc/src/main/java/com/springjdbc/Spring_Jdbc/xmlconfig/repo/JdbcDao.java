package com.springjdbc.Spring_Jdbc.xmlconfig.repo;

import com.springjdbc.Spring_Jdbc.xmlconfig.Bike_Details;


public interface JdbcDao {

	public int insert(Bike_Details bike_details);

	public int update(Bike_Details bike_details, int id);

	public int delete(int id);

}
