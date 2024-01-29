package com.edubridge.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Harshal");
		System.out.println(b.capacity());
		/*String str="Edubridge";
		StringBuffer b1=new StringBuffer(str.length());
		System.out.println(b1.capacity());*/
		//capacity method not allowed this string
		b=new StringBuffer("Edubridge");
		System.out.println(b.capacity());
		
		/*As string is imutableew cant do modification
		 
		System.out.println(str.append("india"));
		  */
		System.out.println(b.append("india"));
		b.setCharAt(9, 'z');
		System.out.println(b);
	}

}
