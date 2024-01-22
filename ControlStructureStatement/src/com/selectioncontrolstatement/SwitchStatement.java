package com.selectioncontrolstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int map_no=s.nextInt();
		switch(map_no) {
		case 1:
			System.out.println("welcome to erangel");
		break;
		case 2:
			System.out.println("welcome to miramar");
		break;
		case 3:
			System.out.println("welcome to sanhok");
		break;
		case 4:
			System.out.println("welcome to erangel");
		break;
		default:
			System.out.println("invalid map no");
		}
	}

}

