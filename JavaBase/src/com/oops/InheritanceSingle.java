package com.oops;

class Humn
{  
	void eat()
	{
		System.out.println("Eating food...");
	}  
}  

class Men  extends Humn
{  
	void walk()
	{
		System.out.println("Walking...");
	}  
}  

public class InheritanceSingle
{  
	public static void main(String args[])
	{  
		Men m = new Men();  
		m.eat();  
		m.walk();  
	}
} 