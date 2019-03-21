package com.javaPrograms;

public class Java_removeSpecial {

	public static void main(String[] args) {
		
		String str = "@#$A$nurag%&$#Soni#!@@$";
		System.out.println("Given String is "+str);
		
		String str1 =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Valid String is "+str1);
		
				
				
	}

}
