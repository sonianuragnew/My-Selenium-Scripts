package com.testng.listener;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

//This class is a general class having Test methods in it, Listener will listen these Test methods
public class ListenerDemo {

	@Test 
	public void testDemoPassedMethod()
	{
		System.out.println("Printing Demo Passed Method");
	}
	
	@Test
	public void testDemoFailedMethod()
	{
		System.out.println("Printing Demo Failed Method");
		Assert.assertEquals("ABC", "XYZ");
	}

	@Test
	public void testDemoSkippedMethod()
	{
		System.out.println("Printing Demo Skipped Method");
		throw new SkipException("Method is skipped!");
	}


}
