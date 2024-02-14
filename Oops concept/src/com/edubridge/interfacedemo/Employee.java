package com.edubridge.interfacedemo;
//program to demonstrate on cloneable interface

//if we are not implementing of cloneble 
//interface and if we are invoking clone method in the driver 
//class we will get in exception as "classNotSupportedExceptin
public class Employee implements Cloneable{
	public int empID;
	public String empName;
	public long salary;
	public Employee(int empID, String empName, long salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

void display()
{
	System.out.println("Emp ID"+empID);
	System.out.println("Emp name"+empName);
	System.out.println("Emp salary"+salary);
}
}
