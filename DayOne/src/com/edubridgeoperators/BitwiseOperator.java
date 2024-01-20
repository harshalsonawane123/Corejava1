package com.edubridgeoperators;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of a nad b");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		

	}

}
