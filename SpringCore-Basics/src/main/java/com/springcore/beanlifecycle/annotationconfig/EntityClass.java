package com.springcore.beanlifecycle.annotationconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EntityClass {

	private int id;
	private String model;

	@PostConstruct
	public void intilizeDatabaseConnection() {

		System.out.println("intilizeDatabaseConnection() Called...!!!!");
	}

	@PreDestroy
	public void CleanUpConnection() {

		System.out.println("CleanUpConnection() Called ..!!!!!!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", model=" + model + "]";
	}

}
