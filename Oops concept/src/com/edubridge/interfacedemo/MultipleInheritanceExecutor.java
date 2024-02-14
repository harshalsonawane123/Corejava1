package com.edubridge.interfacedemo;

import java.util.Scanner;

public class MultipleInheritanceExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Boruto b=new Boruto();
		System.out.println("enter an inputs");
		int noofchildren=s.nextInt();
		String positions=s.next();
		String clan=s.next();
		b.power(noofchildren, positions);
		b.power(noofchildren, clan);

	}

}
