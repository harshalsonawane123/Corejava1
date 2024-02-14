package com.edubridgepolymorphism;

class Stocks
{
	String shareName;
	long sharePrice;
	String shareType;
	
	
	void displayStockDetails(String shareName,long Shareprice)
	{
		System.out.println(shareName+" "+sharePrice);
	}
	
	void displayStockDetails(String shareName,long Shareprice,String shareType)
	{
		System.out.println(shareName+" "+sharePrice);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Stocks.displayStockDetails("birla",2500);
		Stocks.displayStockDetails("birla","nifty-fifty");
		

	}

}
