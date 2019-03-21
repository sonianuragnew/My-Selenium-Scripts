package com.arrayProblems;

public class Java_ArrayLargestSmallest {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50, 60};
		int max = arr[0];
		
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}	
		}
		System.out.println("Largest number in the given array is : "+max);
		
		int min = arr[0];
		
		for(int i= 0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest number in the given array is : "+min);
	}
}
