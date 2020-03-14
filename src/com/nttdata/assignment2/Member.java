package com.nttdata.assignment2;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	String name, address;
	int salary, age;
	long phoneNumber;
	
	public Member() {
		System.out.println("Please input your Name");
		this.name = sc.nextLine();
		System.out.println("Please input your Address");
		this.address = sc.nextLine();
		System.out.println("Please input your Age");
		this.age = sc.nextInt();
		System.out.println("Please input your Phone Number");
		this.phoneNumber = sc.nextLong();
		System.out.println("Please input your Salary");
		this.salary = sc.nextInt();
	}
	
	public void printSalary() {
		System.out.println("This members salary is " + salary);
	}
}
