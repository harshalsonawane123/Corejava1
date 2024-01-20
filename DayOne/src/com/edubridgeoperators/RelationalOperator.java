package com.edubridgeoperators;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("value of A and B");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a=b);
		System.out.println(a!=b);
		System.out.println(a<=b);
	}

}
