package com.nttdata.inheritance;

public class Electronics {

	double regularPrice;
	private String manufacturer;
	
	public double computeSalePrice(double regularPrice,String manufacturer) {
		getManufacturer(manufacturer);
		double salePrice = regularPrice * 0.6;
		return salePrice;
	}
	public String getManufacturer(String manufacturer) {
		return manufacturer;
	}
	public void setManufacturer() {
		this.manufacturer = manufacturer;
	}
}
