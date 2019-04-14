package com.oops;

class Human
{  
	void eat()
	{
		System.out.println("Eating food..."); 
	}  
}

class Man  extends Human
{  
	void walk()
	{
		System.out.println("Walking...");
	}  
}  


class Woman extends Human
{  
	void makeup()
	{
		System.out.println("Sajna hai mujhe Sajna ke liye");
	}  

} 


public class InheritanceHierarichal
{  
	public static void main(String args[])
	{  
		Man m = new Man();  
		m.eat();  
		m.walk();
		//m.makeup();
	}

} 