package com.javaPrograms;

public class Java_TowLargestInArray {
 
	public static void main(String[] args) {
		
		int array[] = {30, 10, 40, 50, 70, 20};
		int largest = 0;
		int seclarge = 0;
		
		for(int i=0; i<array.length; i++)
		{
			if(largest<array[i])
			 {
				seclarge = largest;
				largest = array[i];
			 }
			else if (seclarge<array[i])
			{
				seclarge = array[i];
			}	
		}
		System.out.println("The Largest number is : "+largest);
		System.out.println("Second largest number is : "+seclarge);
	}
}
