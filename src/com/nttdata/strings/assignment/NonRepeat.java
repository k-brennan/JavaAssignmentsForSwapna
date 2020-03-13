package com.nttdata.strings.assignment;

import java.util.Scanner;

public class NonRepeat {
	
	public void checkForRepeatedChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input text for comparison");
		String word = sc.nextLine();
		System.out.println("The given word for comparison is: " + word);
		for(int i = 0; i < word.length(); i++) {
			boolean match = true;
			for (int j = 0; j < word.length(); j++) {
				if (i != j && word.charAt(i) == word.charAt(j)) {
					match = false;
					break;
				}
			}
			if (match) {
				System.out.println("The first non repeated character in String is: " + word.charAt(i));
				break;
			}
		}
	}
	public static void main(String[] args) {
		NonRepeat rep = new NonRepeat();
		rep.checkForRepeatedChar();
	}
}	
