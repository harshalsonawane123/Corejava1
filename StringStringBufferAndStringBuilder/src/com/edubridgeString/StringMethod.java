package com.edubridgeString;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String str1="harshal sonawane";
		String str2="";
		System.out.println(str1.length());
		char []arr=new char[10];
		str1.getChars(0,10, arr, 0);
		System.out.println(Arrays.toString(arr));
		System.out.println(str1.compareTo("harshal sonawane"));
		System.out.println(str1.compareTo("Harshal sonawane"));
		System.out.println(str1.compareToIgnoreCase("harshal sonawane"));
        System.out.println(str2.isEmpty());
       // System.out.println(str2.isblank());
        System.out.println(str1.charAt(4));
}
}