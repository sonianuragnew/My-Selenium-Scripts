package com.javaPrograms;

public class Java_LargestNSmallestInArray {

	public static void main(String[] args) {
		int array[] = {99, 60, 800, 450};
		int largest = array[0];
		int smallest = array[0];
		
		for(int i=1; i<array.length; i++)
		{
			if(array[i] > largest)
			  {
				largest = array[i];
			  }
			else if (array[i]<smallest)
			  {
				smallest = array[i];
			  }
		}
		System.out.println("The largest number in array is : "+largest);
		System.out.println("The smallest number in array is : "+smallest);
	
	}

}
