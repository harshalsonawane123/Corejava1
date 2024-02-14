package com.edubridge.generics;
//program to demonstrate on generic class by passing single data type 
class Citizen<T>
{
	//where t dedfines any kind of T value
	T str;
	T str1;
	void print(T str,T str1)
	{
		this.str=str;
		this.str1=str1;
		System.out.println("the value is:" +str+" "+str1);
	}
}
//driver class 
public class GenericsClass {

	public static void main(String[] args) {
		Citizen<String>c= new Citizen<>();
		c.print("Nagpur", "Indian");

	}

}
