package com.oops;

class OverloadAutomaticPro
{
	public void myMethod(int x)
	{
		System.out.println("myMethod -int version");

	}

	public void myMethod(float f)
	{
		System.out.println("myMethod -float version");
		
	}

	public static void main(String[] args)
	{
		OverloadAutomaticPro ap = new OverloadAutomaticPro();
		ap.myMethod(15);
		ap.myMethod(15.f);
		ap.myMethod(15l);

		
	}

}