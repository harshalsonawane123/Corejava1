package StringTokenizerDemo;

import java.util.StringTokenizer;

public class StringTokenizerD {

	public static void main(String[] args) {
		StringTokenizer t=new StringTokenizer(" "+ 
	" hey there i am using String");
		System.out.println(t.countTokens());
		System.out.println(t.nextToken());
		StringTokenizer t1=new StringTokenizer(" ");
		t1=new StringTokenizer("EDu-Bridge-India","-",false);
		while(t1.hasMoreTokens())
		{
			System.out.println(t1.nextToken());
		}

	}

}
