package com.edubridge.classandobject;
//program to demonstarte non parameterized and parameterized constructor
class Rectangle
{
	//instance variable
	int length;
	int breadth;
	//parameterized constructor
	Rectangle(int length,int breadth)
	{
		//super();
		this.length=length;
		this.breadth=breadth;
		
	}
	//default conbstructor
	Rectangle(){
		System.out.println("Rectangle");
	}
	void displayAreaPerimeter()
	{
		System.out.println("Area Of Rec:"+length*breadth);
		System.out.println("Perimeter Of Rec:"+2*(length+breadth));
	}
}

public class ClassObjectAssi {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4,8);
		Rectangle r2=new Rectangle(4,5);
		r1.displayAreaPerimeter();
		r2.displayAreaPerimeter();

	}

}
