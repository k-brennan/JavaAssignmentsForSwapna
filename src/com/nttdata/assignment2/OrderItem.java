package com.nttdata.assignment2;

public class OrderItem extends Order{

	private String upC;
	private int price, quantity;
	
	public OrderItem(String upC, int price, int quantity) {
		this.upC = upC;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getUpC() {
		return upC;
	}

	public void setUpC(String upC) {
		this.upC = upC;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCost() {
		int total = price * quantity;
		System.out.println("The total cost is £"+total+".");
		return total;
	}
	
}
