package com.testngbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test_DataConsumer {

	@Test(priority = 1,dataProviderClass = Test_AllDataProviders.class, dataProvider = "DataSet1")
	public void loginData(String usrn, String pasw, String brwsr)
	{
		System.out.println("Login Data Method");
	}
	
	@Test(priority = 2,dataProviderClass = Test_AllDataProviders.class, dataProvider="DataSet2")
	public void homePageData(String unam, String pass)
	{
		System.out.println("HomePage Data Method");		
	}
	
	@AfterMethod
	public void afterLogin()
	{
		System.out.println("After Method");
	}
		
}

