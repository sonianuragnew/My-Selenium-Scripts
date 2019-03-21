package com.arrayProblems;

public class Java_CopyArraytoArray {

	public static void main(String[] args) {
	
		int[] a1 = new int[] {10,30,50,70,20};
		int[] a2 = new int[a1.length];

		//copying one array to another
		for(int i=0; i<a1.length; i++)
		{
			a2[i] = a1[i];
		}
		
		//displaying first array
		System.out.println("Elements of First array are :");
		for(int i=0; i<a2.length; i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println("");
		
		//displaying second array
		System.out.println("Elements of Second array are :");
		for(int i=0; i<a2.length; i++)
		{
			System.out.print(a2[i]+" ");
		}		
	}
}
