package com.nttdata.inheritance;

public class Student {

	String studentName;
	int rollNo, ec1Marks, ec2Marks, ec3Marks;
	
	public String Average(int ec1Marks, int ec2Marks, int ec3Marks) {
		String result;
		if(ec1Marks+ec2Marks+ec3Marks/3 >= 50) {
			result = "Pass";
		}else {
			result = "Fail";
		}
		return result;
	}
	
}
