package com.thiskeyword;
//this keyword is used to invoked current class constructor
public class ThisKeywordDemo3 {

	
		public int x;
		ThisKeywordDemo3()
		{
			//this keyword is calling to parameterized constuctor
			this(15);
			System.out.println("non-para");
		}
		ThisKeywordDemo3(int x)
		{
			System.out.println("para"+  x);
		}
		public static void main(String[] args) {
			ThisKeywordDemo3 obj=new ThisKeywordDemo3();
			

	}

}
