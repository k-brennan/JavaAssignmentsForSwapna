package com.nttdata.strings.assignment;

import java.util.Scanner;

public class OnlyDigits {

	public void onlyNumbers(String word) {
		if(word.matches("[0-9]+")&&word.length()>0){
			System.out.println("There are only numbers in "+word+".");
		}else {
			System.out.println("There are not only numbers in "+word+".");
		}
	}
	public static void main(String[] args) {
		System.out.println("Please input some number(s)");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		OnlyDigits od = new OnlyDigits();
		od.onlyNumbers(word);
	}
}
