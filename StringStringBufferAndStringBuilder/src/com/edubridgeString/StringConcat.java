package com.edubridgeString;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str1=s.next();
		String str2=new String(s.next());
		System.out.println(str1.concat(str2));
		System.out.println(20+50+"Hellle"+80+60);
		System.out.println(20+"hello"+80);
		System.out.println("hey student".startsWith("he"));
		System.out.println("hey student".endsWith("ent"));
		System.out.println(str1.toUpperCase());
		System.out.println(" hello harshal  ".trim());
		//System.out.println(" hello harshal  ".strip());
		//System.out.println(str1.repeat(2));
	}

}
