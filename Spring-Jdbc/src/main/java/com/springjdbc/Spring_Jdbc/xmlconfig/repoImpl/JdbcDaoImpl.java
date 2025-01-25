package com.springjdbc.Spring_Jdbc.xmlconfig.repoImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.Spring_Jdbc.xmlconfig.Bike_Details;
import com.springjdbc.Spring_Jdbc.xmlconfig.repo.JdbcDao;

public class JdbcDaoImpl implements JdbcDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	public JdbcDaoImpl() {
		
	}

	public JdbcDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Bike_Details bike_details) {

		String query = "INSERT INTO bike_details ( bike_name, bike_model, bike_number, owner_contact_no, owner_name)\r\n"
				+ "VALUES ( ?, ?, ?, ?, ?);";
		int count = this.jdbcTemplate.update(query, bike_details.getBikeNmae(), bike_details.getBikeModel(),
				bike_details.getBikeNumber(), bike_details.getBikeOwnerContactNo(), bike_details.getBikeOwnerName());
		return count;
	}

	@Override
	public int update(Bike_Details bike_details, int id) {

		String query = "UPDATE bike_details "
				+ "SET bike_name = ?, bike_model = ?, bike_number = ?, owner_contact_no = ?, owner_name = ? "
				+ "WHERE id = ?;";
		int count = this.jdbcTemplate.update(query, bike_details.getBikeNmae(), bike_details.getBikeModel(),
				bike_details.getBikeNumber(), bike_details.getBikeOwnerContactNo(), bike_details.getBikeOwnerName(),
				 id);

		return count;
	}

	@Override
	public int delete(int id) {

		String query = "DELETE FROM bike_details WHERE id = ?;";
		int count = this.jdbcTemplate.update(query, id);
		return 0;
	}

}
