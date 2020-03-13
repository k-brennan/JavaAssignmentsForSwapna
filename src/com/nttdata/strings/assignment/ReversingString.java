package com.nttdata.strings.assignment;

import java.util.Scanner;

public class ReversingString {

	static Scanner sc = new Scanner(System.in);
	
	public void iterationMirror(){ 
	    System.out.println("Please enter text that you want to see printed backwards through iteration"); 
	    String word = sc.nextLine();
	    int length = word.length(); 
	    StringBuilder mirror = new StringBuilder(); 
	    for (int i = length - 1; i >= 0 ; i--){
	        mirror.append(word.charAt(i)); 
	    } 
	    System.out.println(mirror); 
	} 
	
	public void recursiveMirror(String word) {
		if ((word==null)||(word.length() <= 1)){ 
	           System.out.println(word); 
		}else{ 
	            System.out.print(word.charAt(word.length()-1)); 
	            recursiveMirror(word.substring(0,word.length()-1)); 
		} 
	}

	public static void main(String[] args){
		ReversingString rs = new ReversingString();
		rs.iterationMirror();
		System.out.println("Please enter text that you want to see printed backwards through recursion");
		String word = sc.nextLine();
		rs.recursiveMirror(word);
	}
}
