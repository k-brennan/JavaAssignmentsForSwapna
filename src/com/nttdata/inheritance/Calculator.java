package com.nttdata.inheritance;

import java.util.Scanner;

public class Calculator {

	Scanner sc = new Scanner(System.in);
	
	public void add() {
		System.out.println("Please input 2 numbers followed by enter each time that you would like to ADD together");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = num1 + num2;
		System.out.println("The total is : " + total);
	}
	public void subtract() {
		System.out.println("Please input 2 numbers followed by enter each time that you would like to SUBTRACT from");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = num1 - num2;
		System.out.println("The total is : " + total);
	}
	public void multiply() {
		System.out.println("Please input 2 numbers followed by enter each time that you would like to MULTIPLY together");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = num1 * num2;
		System.out.println("The total is : " + total);
	}
	public void divide() {
		System.out.println("Please input 2 numbers followed by enter each time that you would like to DIVIDE");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int total = num1 / num2;
		System.out.println("The total is : " + total);
	}
	
}
