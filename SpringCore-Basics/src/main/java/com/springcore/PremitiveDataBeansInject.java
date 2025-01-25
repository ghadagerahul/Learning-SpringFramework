package com.springcore;

public class PremitiveDataBeansInject {

	private int id;
	private double amount;
	private String name;
	private boolean flag;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "PremitiveDataBeansInject [id=" + id + ", amount=" + amount + ", name=" + name + ", flag=" + flag + "]";
	}

	public PremitiveDataBeansInject(int id, double amount, String name, boolean flag) {
		super();
		this.id = id;
		this.amount = amount;
		this.name = name;
		this.flag = flag;
	}

	public PremitiveDataBeansInject() {
		super();
		// TODO Auto-generated constructor stub
	}

}
