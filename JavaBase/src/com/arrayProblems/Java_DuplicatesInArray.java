package com.arrayProblems;

public class Java_DuplicatesInArray {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {40, 40, 30, 10, 50, 60, 20, 20, 30};
		
		System.out.println("Duplicates in the given array are :");
		{
			for(int i=0 ; i<arr.length; i++)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i] == arr[j])
					{
						System.out.println(arr[j]);
					}
				}
			
			}
			
		}

	}

}
