package com.springjdbc.Spring_Jdbc.xmlconfig;

public class Bike_Details {

	private int id;
	private String bikeNmae;
	private String bikeModel;
	private String bikeNumber;
	private String BikeOwnerContactNo;
	private String bikeOwnerName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBikeNmae() {
		return bikeNmae;
	}

	public void setBikeNmae(String bikeNmae) {
		this.bikeNmae = bikeNmae;
	}

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	public String getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public String getBikeOwnerContactNo() {
		return BikeOwnerContactNo;
	}

	public void setBikeOwnerContactNo(String bikeOwnerContactNo) {
		BikeOwnerContactNo = bikeOwnerContactNo;
	}

	public String getBikeOwnerName() {
		return bikeOwnerName;
	}

	public void setBikeOwnerName(String bikeOwnerName) {
		this.bikeOwnerName = bikeOwnerName;
	}

	@Override
	public String toString() {
		return "Bike_Details [id=" + id + ", bikeNmae=" + bikeNmae + ", bikeModel=" + bikeModel + ", bikeNumber="
				+ bikeNumber + ", BikeOwnerContactNo=" + BikeOwnerContactNo + ", bikeOwnerName=" + bikeOwnerName + "]";
	}

}
