package com.nttdata.account;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int a) {
		super(a);
	}

	private double balance; //= super.getBalance();
	protected double interestRate = 0.05;
	
	@Override
	public void deposit(double sum) {
		balance += sum;
	}



	@Override
	public void withdraw(double sum) {
		balance -= sum;
	}



	@Override
	public int getAccountNumber() {
		return super.getAccountNumber();
	}



	@Override
	public double getBalance() {
		balance = balance + (balance*interestRate);
		return balance;
	}



	public double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public String toString() {
		return "Savings Account No. = "+getAccountNumber()+": Balance = £" + getBalance() + ".";
	}
	
}
