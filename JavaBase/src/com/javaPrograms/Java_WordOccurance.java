package com.javaPrograms;

public class Java_WordOccurance {

	public static void main(String[] args) {
	
		String str1 = "Hello World" ;
		
		char[] ch = str1.toCharArray();
		
		for(int i=0; i<str1.length(); i++)
		{
			String str2 = "";
			
			while( i<ch.length && ch[i] != ' ')
			{
				str2 = str2 + ch[i];
				i++;
			}
			
			System.out.println("Given Word is "+str2+" and length of word is "+str2.length()) ;
		}
		
	}

}
