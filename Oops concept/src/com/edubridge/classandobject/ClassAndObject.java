package com.edubridge.classandobject;
class Vegetables
{
	//variable or fields
	String vegetablename;
	int price;
	
	//methods
	void print()
	{
		System.out.println("vegetable name:"+vegetablename+" "+""
				+ "price is:"+price);
	}
}
//driver class
public class ClassAndObject {

	public static void main(String[] args) {
		Vegetables v=new Vegetables();
		v.vegetablename="Jackfruit";
		v.price=80;
		v.print();
		
		

	}

}
