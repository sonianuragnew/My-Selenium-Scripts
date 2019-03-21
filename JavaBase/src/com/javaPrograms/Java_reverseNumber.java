package com.javaPrograms;

public class Java_reverseNumber {

	public static void main(String[] args) {
		
		long num = 12345;
		System.out.println("Given Number is "+num);
		long rev= 0;
		
		while(num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reversed Number : "+ rev);
		
	}

}
