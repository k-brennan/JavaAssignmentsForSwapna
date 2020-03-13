package com.nttdata.strings.assignment;

import java.util.Scanner;

public class StringMethods {

	static Scanner sc = new Scanner(System.in);
	static String word;
	
	public static void main(String[] args) {
		System.out.println("Please input some Text");
		word = sc.nextLine();
		  int num = 0;
		  char[] inp = word.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  OUTER_LOOP :for (int x = 0; x < word.length(); x++) {
			  INNER_LOOP:for (int y = x + 1; y < word.length(); y++) {
				  if (inp[x] == inp[y]) {
				  System.out.println(inp[y]);
		          num++;
		          break;
		      }
		  }
	  }
		
	}	
}
