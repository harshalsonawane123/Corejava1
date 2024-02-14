package com.thiskeyword;

public class ThisKeywordDemo2 {
	void printone(ThisKeywordDemo2 d)
	{
		System.out.println("welcome to "+"edubridge");
	}
	void printTwo()
	{
		printone(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemo2 d=new ThisKeywordDemo2();
				d.printTwo();

	}

}
