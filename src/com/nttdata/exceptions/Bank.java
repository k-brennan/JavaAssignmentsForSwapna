package com.nttdata.exceptions;

public class Bank implements ICICI, AXIS, SBI {
	
	private float balance;
	private float rateOfInterest;
	private String bank;	
	
	public Bank(String bank, float balance) {
		this.bank = bank;
		this.balance = balance;
		System.out.println("Your Bank account is with : "+bank+"\n"+"Your Balance is : £"+balance);
	}

	@Override
	public float getRateOfInterest(){
		System.out.println("Your rate of Interest with Bank : "+bank+" is "+(rateOfInterest*100)+"%.");
		return rateOfInterest;
	}
	
	public float getBalance()throws LowFundsException {
		if(balance >= 100000) {
			rateOfInterest = 0.065f;
		}else if((balance < 100000) && (balance >= 50000)) {
			rateOfInterest = 0.05f;
		}else if(balance < 50000 && balance >=25000) {
			rateOfInterest = 0.03f;
		}else if(balance < 25000 && balance >=10000) {
			rateOfInterest = 0.0f;
		}else {
			throw new LowFundsException("Your funds are too low to be eligible for a savings account");
		}return rateOfInterest;
	}
}