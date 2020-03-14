package com.nttdata.assignment2;

import java.util.ArrayList;

public class Order {

	int totalCost;
	ArrayList <OrderItem> orderItem = new ArrayList <OrderItem>();
	
	public void addOrder(OrderItem OrderItem) {
		orderItem.add(OrderItem);
	}
	
	public int getTotalCost() {
		for(OrderItem oI : orderItem) {
			totalCost = oI.getCost();
		}
		return totalCost;
	}
	
	public void printOrderItems() {
		for(OrderItem oI: orderItem) {
			System.out.println("UPC : "+oI.getUpC());
			System.out.println("Price : £"+Integer.toString(oI.getPrice()));
			System.out.println("Quantity : "+Integer.toString(oI.getQuantity()));
			System.out.println("Total Cost : £"+Integer.toString(oI.getCost()));
		}
	}
}
