package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;


public class GenericsAdvantage {

	public static void main(String[] args) {
		// 1)Type safety
		List<String> obj=new ArrayList<>();
		//it ensure that to add only String values
		// 3)conpile time checking
		//obj.add(11);
		obj.add("11");
		obj.add("Harshal");
		
		//2) type casting is not required
		//List obj1=new ArrayList<>();
		List<String> obj1=new ArrayList<>();
		obj1.add("Harshal Sonawane");
		obj1.add("harsh");
		//without generic type casting is required
		//String str1=(String) obj1.get(0);
		String str1=obj1.get(1);
		System.out.println(str1);

	}

}
