package com.nttdata.strings.assignment;

import java.util.Scanner;

public class Occuring {

	public int countOccurrences(String word, char[] ch) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch[0]) {
				count++;
			}
		}
		System.out.println("The amount of "+ch[0]+"'s that occur in "+word+" is... "+count);
		return count;
	}

    public char highestOccurringChar(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please input some text");
    	String word = sc.nextLine();
        int maxOccur=0;
        char maxOccurredChar = ' ';

        for (int i=0; i<word.length(); i++){
            int currentLetterOccurrences = 0;
            char currentChar = word.charAt(i);

            for (int j=0; j<word.length(); j++){
                if (word.charAt(j)==currentChar) {
                    currentLetterOccurrences ++;
                }
            }
            if (currentLetterOccurrences > maxOccur){
                maxOccur = currentLetterOccurrences;
                maxOccurredChar = currentChar;
            }
        }
        System.out.println("The most occurred letter from "+word+" is :"+maxOccurredChar);
        System.out.println("That letter occurred "+maxOccur+" times");
        return maxOccurredChar;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input some text");
		String word = sc.nextLine();
		System.out.println("Which character will you like to count the occurance of?");
		char[] ch = sc.nextLine().toCharArray();
		Occuring occ = new Occuring();
		occ.countOccurrences(word, ch);
		occ.highestOccurringChar();
	}
}
