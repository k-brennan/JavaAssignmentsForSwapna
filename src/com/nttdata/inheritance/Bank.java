package com.nttdata.inheritance;

import java.util.Scanner;

public class Bank {

	private int accountNo;
	private int balance;
	
	Scanner sc = new Scanner(System.in);
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int depositedAmt) {
		balance += depositedAmt;
		return balance;
	}
	
	public int withdraw(int withdrawAmt) {
		balance -= withdrawAmt;
		if(balance>=0) {
		return balance;
		}else {
			return -1;
		}
	}
	
}
