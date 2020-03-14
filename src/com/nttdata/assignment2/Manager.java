package com.nttdata.assignment2;

public class Manager extends Member {

	String specialization, department;
	
	public Manager() {
		super();
		System.out.println("Here are all your details for this Manager");
		System.out.println("Name : "+ super.name+" Age : "+super.age);
		System.out.println("Address : "+super.address+" Phone Number : "+super.phoneNumber);
		System.out.println("Salary : "+salary);
	}
	
}
