package com.edubridge.lambdaexpression;
@FunctionalInterface

public interface Product { 
	//abstract method
	void displayProductPrice(int price);
	default String displayProductName()
	{
		return "perfume";
	}
	//static method
	static String ProductBrand()
	{
		return "ParkAvenue";
	}
}
