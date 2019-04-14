package com.oops;

class Base
{
	public static void driveCar()
	{
		System.out.println("Speed limit is 80 KMPH");
	}

}

class Child extends Base
{
	public static void driveCar()
	{	
		System.out.println("No Limits");

	}

}

class OverrideAbstractTest
{
	public static void main(String[] args)
	{
		Base b = new Child();
		//b.driveCar();
	}

}