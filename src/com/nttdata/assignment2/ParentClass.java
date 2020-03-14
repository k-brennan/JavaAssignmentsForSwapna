package com.nttdata.assignment2;

public class ParentClass {

	public boolean even;
	
	public boolean isAllEven(int[] num) {
		for(int i : num) {
			if(i%2==0) {
				even = true;				
			}else {
				even = false;
				break;				
			}
		}if(even == true) {
			System.out.println("All numbers are Even");
		}else {
			System.out.println("There are odd numbers here!");
		}return even;
	}
	
	public void parentClass() {
		System.out.println("This is the Parent Class!");
	}

}
