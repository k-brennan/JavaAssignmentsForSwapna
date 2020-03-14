package com.nttdata.assignment2;

import java.util.Scanner;

public class Rectangle{

	double length, width;
	Scanner sc = new Scanner(System.in);
	
	public Rectangle() {
		System.out.println("Please enter the length of the Rectangle");
		this.length = sc.nextDouble();
		System.out.println("Please enter the width of the Rectangle");
		this.width = sc.nextDouble();
	}
	public void area() {
		double area = length * width;
		System.out.println("The area of the Rectangle is "+area);
	}

	public void perimeter() {
		double perimeter = (length * 2) + (width * 2);
		System.out.println("The Perimeter of the Rectangle is "+perimeter);
	}
}
class Square extends Rectangle{
	public Square() {
		super();
		this.length = super.length;		
	}
	public void area() {
		double area = length * length;
		System.out.println("the are of the square is : "+area);
	}
	public void perimeter() {
		double perimeter = length * 4;
		System.out.println("The Perimeter of the Rectangle is "+perimeter);
	}
}