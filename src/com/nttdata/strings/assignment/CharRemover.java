package com.nttdata.strings.assignment;

import java.util.Scanner;

public class CharRemover {

	 public String charRemover() {
	 	System.out.println("Please type some text");	
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Which letter would you like to remove?");
		String ch = sc.next();
		char[] ch1 = ch.toCharArray();
		String newString = "";
	    boolean removedChar = false;
	    for (int i=0; i<word.length(); i++){
	    	 if (word.charAt(i)!=ch1[0] ){
	    		 newString += word.charAt(i);
	         }else{
	        	 if (removedChar == false){
	        		 removedChar = true;
	             }else{
	            	 newString += word.charAt(i);
	             }
	         }
	    }
	    System.out.println("The word with the first "+ch+" removed is "+newString+".");
	    return newString;
	}

	 public static void main(String[] args) {
		CharRemover cr = new CharRemover();
		cr.charRemover();
	}
}
