package com.nttdata.assignment2;

public class Employee extends Member {

	String specialization, department;
	
	public Employee() {
		super();
		System.out.println("Here are all your details for this Employee");
		System.out.println("Name : "+ super.name+" Age : "+super.age);
		System.out.println("Address : "+super.address+" Phone Number : "+super.phoneNumber);
		System.out.println("Salary : "+salary);
	}
	
}
