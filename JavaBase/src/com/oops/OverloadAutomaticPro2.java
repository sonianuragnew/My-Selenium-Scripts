package com.oops;

class OverloadAutomaticPro2
{
	public void myMethod(int x, float f)
	{
		System.out.println("myMethod -int version");

	}

	public void myMethod(float f, int x)
	{
		System.out.println("myMethod -float version");
		
	}

	public static void main(String[] args)
	{
		OverloadAutomaticPro2 a = new OverloadAutomaticPro2();
		a.myMethod(10, 10.10f);
		a.myMethod(10.10f, 10);
		//a.myMethod(5,6);
		
	}

}