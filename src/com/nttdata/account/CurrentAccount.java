package com.nttdata.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int a) {
		super(a);
	}
	private int balance;
	@Override
	public void deposit(double sum) {
		super.deposit(sum);
		
	}

	@Override
	public void withdraw(double sum) {
			if (sum>0) {
				if((balance-sum)>-100) {
					 balance-=sum;
				}else {
					System.out.println("You can't go lower than -£100 overdraft");
				}
   			}else {
			    System.err.println("Account.withdraw(...): "
					       +"cannot withdraw negative amount."); 
		    }
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public int getAccountNumber() {
		return super.getAccountNumber();
	}

	@Override
	public String toString() {
		return "Current Account No. = "+getAccountNumber()+": Balance = £" + getBalance() + ".";
	}	
	
}
