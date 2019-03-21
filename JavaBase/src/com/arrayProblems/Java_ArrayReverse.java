package com.arrayProblems;

public class Java_ArrayReverse {

	public static void main(String[] args) {
	
		int[] arr = new int[]{10, 20, 30, 40, 50 ,60};
		
		System.out.println("Original Array values are :");
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("");
		System.out.println("Revrsed Array values are : ");
		for(int i=arr.length-1; i>0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
