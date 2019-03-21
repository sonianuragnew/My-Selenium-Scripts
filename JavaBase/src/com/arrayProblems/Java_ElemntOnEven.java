package com.arrayProblems;
public class Java_ElemntOnEven {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
		
		System.out.println("Elements on the even places are : ");
		for(int i=1; i<arr.length; i= i+2)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Elements on the odd places are : ");
		for(int i=0; i<arr.length; i=i+2)
		{
			System.out.print(arr[i]+" ");
		}	
	}

}
