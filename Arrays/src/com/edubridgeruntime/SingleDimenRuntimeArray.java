package com.edubridgeruntime;

import java.util.Scanner;

public class SingleDimenRuntimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//array declaratiom
		int arr[]=new int[n];
		//to initialize an array of elements
		for(int i=0;i<n;i++)
		{
			arr[1]=s.nextInt(); //storing the array element
		}
		System.out.print("array elents are");
		//print an array element
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
