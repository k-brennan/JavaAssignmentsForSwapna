package com.nttdata.strings.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram { 
	
		static Scanner sc = new Scanner(System.in);
		
	    static boolean areAnagram(){ 
	        System.out.println("Please input some text"); 
	        String str1 = sc.next();
	        System.out.println("Please input text to compare as Anagram of first input");
	        String str2 = sc.next();
	        char[] ch1 = str1.toCharArray();
	        char[] ch2 = str2.toCharArray();
	        
	        int n1 = ch1.length; 
	        int n2 = ch2.length; 
	  
	        if (n1 != n2) 
	            return false; 
	   
	        Arrays.sort(ch1); 
	        Arrays.sort(ch2); 
	   
	        for (int i = 0; i < n1; i++) 
	            if (ch1[i] != ch2[i]) 
	                return false; 
	  
	        return true; 
	    } 

	    public static void main(String args[]){ 
	        if (areAnagram()) { 
	            System.out.println("The two strings are anagram of each other"); 
	        }else {
	            System.out.println("The two strings are not an anagram of each other"); 
	        }
	    } 
} 
