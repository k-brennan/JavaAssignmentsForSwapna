package com.nttdata.assignment2;

public class MainClass {

	public static void main(String[] args) {

		ParentClass cls = new ParentClass();
		cls.isAllEven(new int[] { 9, 2, 4, 6 });
		cls.parentClass();
		ChildClass chl = new ChildClass();
		chl.childClass();
		chl.parentClass();
		Employee emp = new Employee();
		emp.printSalary();
		Manager man = new Manager();
		man.printSalary();
		Rectangle rect = new Rectangle();
		rect.area();
		rect.perimeter();
		Square sq = new Square();
		sq.area();
		sq.perimeter();
		Square1 sq1 = new Square1();
		sq1.print();
		OrderItem oO = new OrderItem("Prod", 10, 1);
		OrderItem xX = new OrderItem("prod", 5, 3);
		Order oo = new Order();
		oo.addOrder(oO);
		oo.addOrder(xX);
		oo.printOrderItems();
		oo.getTotalCost();
	}
}
