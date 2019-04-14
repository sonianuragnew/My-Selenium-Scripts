package com.oops;

class Parent
{
	public  int x = 10;
	public void parentMethod()
	{
		System.out.println("Method of Parent class");
	}

}

public class InheritanceChild extends Parent
{
	public void childMethod()
	{
		System.out.println("Method of child class");
	}	

	public static void main(String[] args) 
	{
		InheritanceChild c = new InheritanceChild();
		c.parentMethod();
		c.childMethod();	

    	}

}