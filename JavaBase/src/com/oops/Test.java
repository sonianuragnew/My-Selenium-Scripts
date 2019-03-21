package com.oops;

/*
byte ==> short ==> int ==> long ==> float ==> double |
char /
*/
public class Test {

	public void m1()
	{
		System.out.println("No Argument Version");
	}
	
	public void m1(int i)
	{
		System.out.println("Int Argument Version");
	}
	
	public void m1(double d)
	{
		System.out.println("Double Argument version");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.4);

	}

}
