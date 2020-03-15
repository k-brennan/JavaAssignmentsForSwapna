package com.nttdata.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handler {

	Scanner sc = new Scanner(System.in);
	
	public void validateEmail(String email)throws EmailException {
		if(email.contains("@")&&email.contains(".")) {
			System.out.println("Email is valid");
		}else {
			throw new EmailException("Your email is invalid");
		}
	}
	
	public void getNumber() {
		try {
			System.out.println("Please write a number");
			int number = sc.nextInt();	
			System.out.println("Your input number is : "+number);
		}catch(InputMismatchException e) {
			System.out.println("Please only input whole numbers & no letters");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws EmailException {
		Handler eh = new Handler();
		eh.getNumber();
		eh.validateEmail("blah@gmail.com");
		eh.validateEmail("lalala.com");
		eh.validateEmail("lalala@blah");
	}
}
