package com.oops;

class HumanBeing
{  
	void eat()
	{
		System.out.println("Eating food...");
	}  
}  

class Person  extends HumanBeing
{  
	void walk()
	{
		System.out.println("Walking...");
	}  
}  

class Baby extends Person
{  
	void play()
	{
		System.out.println("Playing...");
	}  

} 

public class InheritanceMultiLevel
{  
	public static void main(String args[])
	{  
		Baby b = new Baby();  
		b.eat();  
		b.walk();  
		b.play();
	}

} 