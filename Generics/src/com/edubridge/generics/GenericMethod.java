package com.edubridge.generics;

public class GenericMethod {
	public static<E>void accept(E[]arr)
	{
		for(E itr:arr)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[]arr1= {55,4,89,70};
		String[] arr2= {"harshal","harsha","sonwane"};
		System.out.println("first array");
		GenericMethod.accept(arr2);

	}

}
