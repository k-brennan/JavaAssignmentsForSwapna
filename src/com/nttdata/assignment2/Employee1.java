package com.nttdata.assignment2;

public class Employee1 {

	int salary;
	int hoursWorked;
	
	public void displaySalary() {
		System.out.println("This is your salary : "+salary);
	}
	public void getInfo(int salary, int hoursWorked) {
		this.hoursWorked = hoursWorked;
		this.salary = salary;
	}
	public void addSal() {
		if(salary<500) {
			this.salary += 10;
		}
	}
	public void addWork() {
		if((hoursWorked/5)>6) {
			this.salary += 5;
		}
	}
	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.getInfo(450, 45);
		emp.addSal();
		emp.addWork();
		emp.displaySalary();
	}
}
