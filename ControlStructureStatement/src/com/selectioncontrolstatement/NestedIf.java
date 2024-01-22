package com.selectioncontrolstatement;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age and weight");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if((weight>=45 && weight<=110) || weight>=110)
			{
				System.out.println("eligible for bunjee jumping");
		}
		else
		{
			System.out.println("not eligible for bunjee jumping");
		}
	}
	 else
	{
		System.out.println("not eligible for jumping");
	}

	}
}
