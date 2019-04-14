package com.oops;

class Overload
{
	public void myMethod(int x)
	{
		System.out.println("Today is Sunday !!!");

	}

	public void myMethod(String s)
	{
		System.out.println("But we are not enjoying");
		
	}

	public static void main(String[] args)
	{
		Overload mo = new Overload();
		mo.myMethod(10);
		mo.myMethod("Day");

	}

}