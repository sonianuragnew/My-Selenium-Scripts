package com.arrayProblems;
public class Java_TwoLargestElements {

	public static void main(String[] args) {

		int largest = 0;
		int seclarge = 0;
		int count = 7;
		int [] arr = new int[] {10, 20, 30, 40, 50, 60, 70};
		
		for(int i=0; i<arr.length; i++)
		{
			if(largest<arr[i])
			{
				seclarge = largest;
				largest = arr[i];
			}
			else
			{
				seclarge = arr[i];
			}
		}	
		System.out.println("The Largest number in array is : "+largest);
		System.out.println("Second Large number in array is : "+seclarge);
	}

}
