package com.nttdata.beautysalon;

import java.util.Date;

public class BeautySalonMain {

	public static void main(String[] args) {

		Customer c1 = new Customer("Kieran Brennan", "Premium");
        Customer c2 = new Customer("Tech Academy", "Silver");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Visit v1 = new Visit(c1, new Date());
        System.out.println(v1.toString());

        v1.setProductExpense(10.5);
        v1.setServiceExpense(20);
        v1.setProductExpense(1.5);
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());
		
	}
}
