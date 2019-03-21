package com.javaPrograms;

public class Java_reverseString {

	public static void main(String[] args) {
		
		String str1 = "Anurag";
		System.out.println("First String whicch is to be reversed is :"+ str1);
		
		StringBuffer sb = new StringBuffer(str1);
		System.out.println("First String after reverse is :"+sb.reverse());
		
		System.out.println("==========================================================================");
		
		String 	str2 = "Soni";
		System.out.println("Second String whicch is to be reversed is :"+ str2);
		String rev="";
		int length = str2.length(); //4
		
		for(int i = length-1; i>=0; i--)
		{
			rev = rev + str2.charAt(i);
		}
		System.out.println("Second String after reverse is :"+rev);
		
	}

}
