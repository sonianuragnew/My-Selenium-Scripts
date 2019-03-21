package com.testng.listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import junit.framework.Assert;

//This class will extend the TestListenerAdapter class so that we can write our own login(override) for methods available in TestListenerAdapter class
public class MyListener  extends TestListenerAdapter 
{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Attention -Listener is started");			
	}

	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("The Test is Failed, Try again!");
		System.out.println("Failed Method name is :: "+tr.getName());
	}
	
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test is skipped for some reason");
		System.out.println("Skipped Method name is :: "+tr.getName());
		
	}
	
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Congrats! The test is executed successfully");
		System.out.println("Passed Method name is :: "+tr.getName());
	}
	
	
}
