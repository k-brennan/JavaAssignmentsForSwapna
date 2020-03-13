package com.nttdata.inheritance;

import java.util.Scanner;

public class TaxCalculator {
	long panNumber, annualIncome, investedAmount, taxableAmount;
	double tax;
	String gender;
	Scanner sc = new Scanner(System.in);
	
	public TaxCalculator(long panNumber){
		this.panNumber = panNumber;
		System.out.println("Please enter your Annual Income");
		this.annualIncome = sc.nextLong();
		System.out.println("Please enter your Invested Amount");
		this.investedAmount = sc.nextLong();
		this.taxableAmount = annualIncome - investedAmount;	
	}
	public void calculateTax(long taxableAmount) {
		if((taxableAmount>=0)&&(taxableAmount<=2000)) {
			tax = 0.0;
		}else if((taxableAmount>=2001)&&(taxableAmount<=5000)) {
			tax = 0.02;
		}else if((taxableAmount>=5001)&&(taxableAmount<=10000)) {
			tax = 60 + 0.04;
		}else if((taxableAmount>=10001)&&(taxableAmount<=15000)) {
			tax = 260 + 0.06;
		}else if((taxableAmount>=15001)&&(taxableAmount<=20000)) {
			tax = 560 + 0.08;
		}else if((taxableAmount>=20001)&&(taxableAmount<=30000)) {
			tax = 960 + 0.1;
		}else if((taxableAmount>=30001)&&(taxableAmount<=50000)) {
			tax = 1960 + 0.125;
		}else {
			tax = 4460 + 0.15;
		}
	}
	public static void main(String[] args) {
		TaxCalculator person = new TaxCalculator(111000);
		person.calculateTax(person.taxableAmount);
		System.out.println("Your tax rate is : " + person.tax);
	}
}
