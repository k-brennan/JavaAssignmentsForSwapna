package com.nttdata.assignment2;

class Shape {

	public void print() {
		System.out.println("This is a Shape");
	}	
}
class Circle extends Shape {

	public void print() {
		System.out.println("This is a Circle");
	}
}
class Rectangle1 extends Shape {
	
	public void print() {
		super.print();
		System.out.println("This is a Rectangle");
	}
}
class Square1 extends Rectangle1{

	public void print() {
		super.print();
		System.out.println("A Square is a Rectangle");
	}
}