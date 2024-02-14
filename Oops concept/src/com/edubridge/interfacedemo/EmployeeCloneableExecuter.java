package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableExecuter {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter emp id :");
		int empID=s.nextInt();
		System.out.println("enter emp name :");
		String empName=s.next();
		System.out.println("enter emp salary :");
		long salary=s.nextLong();
		
		Employee e1=new Employee(empID,empName,salary);
		//override a clone method inside an implementable class
		Employee e2=(Employee)e1.clone();
		e2.display();
	
	}

}
