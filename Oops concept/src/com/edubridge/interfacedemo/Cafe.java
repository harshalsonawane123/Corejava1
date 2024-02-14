package com.edubridge.interfacedemo;

public interface Cafe {
	/*all the fields inside an interface are by default public
	 * static final*/
	String menu="pav bhaji";
	
	//all the methods inside an interface are by default public abstract
	
	void showMenu();
	void displayPrice();

}
