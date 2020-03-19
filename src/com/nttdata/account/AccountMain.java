package com.nttdata.account;

public class AccountMain {

	public static void main(String[] args) {

		Bank ba = new Bank();
		Account acc = new Account(101);
		acc.deposit(100);
		acc.withdraw(50);
		//acc.print();
		SavingsAccount sa = new SavingsAccount(100);
		sa.deposit(500);
		//sa.getBalance();
		//sa.print();
		CurrentAccount ca = new CurrentAccount(102);
		ca.withdraw(110);
		ca.withdraw(90);
		//ca.print();
		ba.addAccount(sa);
		ba.addAccount(acc);		
		ba.addAccount(ca);
		ba.getTotalAccount();
		ba.update();
		ba.getTotalAccount();
		ba.closeAccount(ca);
		ba.openAccount(sa);
		
	}

}
