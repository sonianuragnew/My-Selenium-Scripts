package com.javaPrograms;

public class Java_ImpStringConcept {

	public static void main(String[] args) 
	{
		 
		System.out.println(10 + 20 + "AnuragSoni");
		System.out.println("AnuragSoni" + 10 + 20 );
/*In the first case, 10 and 20 are treated as numbers and added to be 30. Now, their sum 30 is treated as the string 
and concatenated with the string AnuragSoni. Therefore, the output will be 30AnuragSoni.

In the second case, the string AnuragSoni is concatenated with 10 to be the string AnuragSoni10 which will then be
concatenated with 20 to be AnuragSoni1020.*/
		
		System.out.println("===========================================================================");
		
		System.out.println(10 * 20 + "AnuragSoni");
		System.out.println("AnuragSoni" + 10 * 20);
/*In the first case, The numbers 10 and 20 will be multiplied first and then the result 200 is treated as the 
string and concatenated with the string AnuraSoni to produce the output 200AnuragSoni.
In the second case, The numbers 10 and 20 will be multiplied first to be 200 because the precedence of the 
multiplication is higher than addition. The result 200 will be treated as the string and concatenated with the 
string AnuragSoni to produce the output as Anuragsoni200.*/
		
	}

}
