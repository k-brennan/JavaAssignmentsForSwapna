package com.nttdata.assignment2;

import java.util.Scanner;

public class Invoice {

	private double price;
	private int quantity;
	private String partNumber, partDescription;
	Scanner sc = new Scanner(System.in);
	
	public Invoice(){
		System.out.println("Please input a Description of Product/Part you need");
		this.partDescription = sc.nextLine();
		System.out.println("Please input the Product/Part number");
		this.partNumber = sc.nextLine();
		System.out.println("Please input the Price of the Product/Part");
		this.price = sc.nextDouble();
		System.out.println("Please input the quantity of the Product/Part you need");
		do{	
			this.quantity = sc.nextInt();
			if(quantity>0) {
					break;
				}else {
					System.out.println("Quantity has to be more than 0, Please input again");
					this.quantity = sc.nextInt();
				}
			}while(quantity>0);
		}
	public double getPrice(double price) {
		return price;
	}
	public void setPrice() {
		this.price = price;
	}
	public int getQuantity(int quantity) {
		return quantity;
	}
	public void setQuantity() {
		this.quantity = quantity;
	}
	public String getPartNumber(String partNumber) {
		return partNumber;
	}
	public void setPartNumber() {
		this.partNumber = partNumber;
	}
	public String getPartDescription(String partDescription) {
		return partDescription;
	}
	public void setPartDescription() {
		this.partDescription = partDescription;
	}
	public void getInvoice() {
		this.price = this.quantity * this.price;
		System.out.println("Product Description : "+this.getPartDescription(partDescription));
		System.out.println("Product Number : "+this.getPartNumber(partNumber));
		System.out.println("Quantity : "+this.getQuantity(quantity));
		System.out.println("Total : $"+this.getPrice(price));
	}
	public static void main(String[] args) {
		Invoice customer = new Invoice();
		customer.getInvoice();
	}
}
