package com.nttdata.beautysalon;

import java.util.Date;

public class Visit {

	private Customer name;
	private double serviceExpense, productExpense;
	private Date date;
		
	public Visit(Customer name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public String getCustomerName() {
		return name.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	
	public double getTotalExpense() {
		return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType().toUpperCase()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType().toUpperCase())));
	}

	
	public String toString() {
		return "Visit [name=" + name + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense
				+ ", date=" + date + "]";
	}

}
