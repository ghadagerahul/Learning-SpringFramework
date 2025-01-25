package com.springjdbc.Spring_Jdbc.annotationconfig;

public class Employee_Detatails {

	private int eId;

	private String eName;
	private String eDesignation;

	private double eSalary;
	private String eCompanyTyp;
	private String eCompanyName;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public String geteCompanyTyp() {
		return eCompanyTyp;
	}

	public void seteCompanyTyp(String eCompanyTyp) {
		this.eCompanyTyp = eCompanyTyp;
	}

	public String geteCompanyName() {
		return eCompanyName;
	}

	public void seteCompanyName(String eCompanyName) {
		this.eCompanyName = eCompanyName;
	}

	@Override
	public String toString() {
		return "Employee_Detatails [eId=" + eId + ", eName=" + eName + ", eDesignation=" + eDesignation + ", eSalary="
				+ eSalary + ", eCompanyTyp=" + eCompanyTyp + ", eCompanyName=" + eCompanyName + "]";
	}

}
