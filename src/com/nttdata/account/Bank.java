package com.nttdata.account;

import java.util.ArrayList;

public class Bank {
	
	ArrayList<Account> a = new ArrayList <Account>();
	
	public void addAccount(Account Account) {
		a.add(Account);
	}
	
	public void getTotalAccount() {
		for(Account ac : a) {
			ac.print();
		}
	}
	
	public void update() {
		
		for(Account ac : a) {
			try {
				ac.getBalance();
			}catch(Exception e) {
				System.out.println("This Bank account is not a savings account to apply Interest");
			}
			if(ac.getBalance()<0) {
				System.out.println("Overdraft Letter printed & sent!");
			}
		}

	}
	
	public void openAccount(Account acc) {
		String at = "class com.nttdata.account.Account";
		String bt = "class com.nttdata.account.CurrentAccount";
		String ct = "class com.nttdata.account.SavingsAccount";
		String at1 = acc.getClass().toString();
		if(at.equals(at1)) {
			System.out.println("Congratulations on Opening your Account!");
		}else if(bt.contentEquals(at1)) {
			System.out.println("Congratulations on Opening your Current Account!");
			System.out.println("Your overdraft limit is -£100");
		}else if(ct.equals(at1)) {
			System.out.println("Congratulations on Opening your Savings Account!");
			System.out.println("Your interest rate is 5%");
		}
	}
	
	public void closeAccount(Account acc) {
		System.out.println("Sorry to hear you're closing you're account with us");
		if(acc.getBalance()>=0) {
			System.out.println("Please take your money of £"+acc.getBalance()+".");
			System.out.println("Have a nice day");
		}else {
			System.out.println("Sorry, but you must clear your overdraft before closing down your account");
		}
	}
	
	/*public static void main(String[] args) {
		
		Account ac1 = new Account(101);
		ac1.deposit(200);
		SavingsAccount sac = new SavingsAccount(102);
		sac.deposit(500);
		CurrentAccount cac = new CurrentAccount(103);
		cac.withdraw(100);
		cac.withdraw(90);
		Bank bnk = new Bank();
		bnk.addAccount(ac1);
		bnk.addAccount(sac);
		bnk.addAccount(cac);
		bnk.getTotalAccount();
		
	}*/
	
}
