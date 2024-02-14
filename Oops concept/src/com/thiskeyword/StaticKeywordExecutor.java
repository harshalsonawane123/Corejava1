package com.thiskeyword;

public class StaticKeywordExecutor {
	class LearnerDetails
	{
		static String name;
		static int rollno;
		//institute name for all the learner are common we can declare innstitute name static
		static String instituteName="Edubridge";
		//if any method is non static and we want to inside the main method then make that method as static
	}
	public static void print()
	{
		System.out.println(name+" "+rollno+" "+instituteName);
	}
	public class StaticKeywordExecutor{

	public static void main(String[] args) {
		LearnerDetails.rollno=101;
		LearnerDetails.name="harsh";
		LearnerDetails.print();
		
		LearnerDetails.rollno=102;
		LearnerDetails.name="harshal";
		LearnerDetails.print();
		
		
	
		
		

	}
	}
}
