package com.nttdata.inheritance;

import java.util.Scanner;

public class Circle {

	double radius;
	final double PI = 3.14159;
	Scanner sc = new Scanner(System.in);
	
	public void Area() {
		System.out.println("please enter the radius of the Circle");
		radius = sc.nextDouble();
		double area = PI * (radius * radius);
		System.out.println("The Circles area = " + area);		
	}
	public void Perimeter() {
		System.out.println("please enter the radius of the Circle");
		radius = sc.nextDouble();
		double perimeter = 2 * PI * radius;
		System.out.println("The Circles perimeter = " + perimeter);
	}
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.Area();
		circle.Perimeter();
	}
}
