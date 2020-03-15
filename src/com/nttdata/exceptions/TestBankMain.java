package com.nttdata.exceptions;

public class TestBankMain {

	public static void main(String[] args) throws LowFundsException {

		Bank obj = new Bank("Axis", 5000);
		//Bank obj = new Bank("ICICI", 10000);
		//Bank obj = new Bank("SBI", 25000);
		//Bank obj = new Bank("Axis", 50000);
		//Bank obj = new Bank("SBI", 150000);
		obj.getBalance();
		obj.getRateOfInterest();
			
	}
}