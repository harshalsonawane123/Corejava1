package com.edubridgeoperators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of A and B");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		
		
		

	}

}
