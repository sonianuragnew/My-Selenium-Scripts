package com.oops;

class Base3
{
	public void driveCar()
	{
		System.out.println("Speed limit is 80 KMPH");
	}

}

class Child3 extends Base3
{
	public void driveCar()
	{
		System.out.println("Jab tak jaan jane jahan, main bhgunga");
	}

}

class Override
{
	public static void main(String[] args)
	{
		Base3 p = new Child3();
		p.driveCar();
	}

}