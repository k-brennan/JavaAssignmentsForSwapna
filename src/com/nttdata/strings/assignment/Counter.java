package com.nttdata.strings.assignment;

import java.util.Scanner;

public class Counter {

	public void countRepetition() {
		System.out.println("Please input some text");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		    int number = 0 ;
		    for (int i = 0; i < word.length(); i++){
		        for (int j = 0; j < word.length(); j++) {
		            if(word.charAt(i)==word.charAt(j)){
		                number++;
		            }
		        }   
		        System.out.println(word.charAt(i)+" -- "+number);
		        String letter = String.valueOf(word.charAt(i)).trim();
		        number = 0;
		    }
	}
	
	public void vowelAndConsCounter(){
		System.out.println("Please input some text to check for Vowels/Consonents");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int vCount = 0, cCount = 0;

        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
        	char ch = word.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){ 
        		vCount++; 
        	}else if((ch >= 'a'&& ch <= 'z')) {
                cCount++;
           }
        }
        System.out.println("Number of Vowels: " + vCount);
        System.out.println("Number of Consonants: " + cCount);
    }
	
	public static void main(String[] args) {
		Counter rep = new Counter();
		rep.countRepetition();
		rep.vowelAndConsCounter();
	}
}
