package com.oops;

class Base2
{
	public Object driveCar()
	{
		System.out.println("Speed limit is 80 KMPH");
		return null;
	}

}

class Child2 extends Base2
{
	public String driveCar()
	{
		System.out.println("Jab tak jaan jane jahan, main bhgunga");
		return null;
	}

}

class OverrideReturnType
{
	public static void main(String[] args)
	{
		Base2 p = new Base2();
		p.driveCar();
	}

}