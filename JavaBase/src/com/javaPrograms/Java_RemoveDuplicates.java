package com.javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class Java_RemoveDuplicates {

	public static void main(String[] args) {
		String str = "anurag";
		System.out.println("Given String here is : "+str);
		Set<Character> set = new HashSet();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<str.length(); i++)
		{
			Character c  = str.charAt(i);
			
			if(!set.contains(c))
			{
				set.add(c);
				sb.append(c);
			}	
		}
		System.out.println("String after removing duplicates is : "+sb.toString());	
	
	
	}
}
