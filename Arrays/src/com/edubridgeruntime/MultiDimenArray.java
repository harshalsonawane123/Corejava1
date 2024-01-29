package com.edubridgeruntime;

import java.util.Scanner;

public class MultiDimenArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int m=s.nextInt();
		int n=s.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=s.nextInt();
		}
	
	}
			
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
			System.out.print(arr[i][j]+" ");
	
		}
	      System.out.println();
	}
}
}


