package com.testngbasics;

import org.testng.annotations.DataProvider;

public class Test_AllDataProviders {
	
	//First Data Provider
	@DataProvider(name="DataSet1")
	public Object[][] getMyData()
	{
		//First Data Provider
		Object[][] myData = new Object[3][3];
		
		myData[0][0] = "UserName1";
		myData[0][1] = "Password1";
		myData[0][2] = "Chrome" ;
		
		myData[1][0] = "UserName2";
		myData[1][1] = "Password2";
		myData[1][2] = "FireFox" ;
		
		myData[2][0] = "UserName3";
		myData[2][1] = "Password3";
		myData[2][2] = "Edge" ;
		
		return myData;
	}
	
	//Second data provider
	@DataProvider(name="DataSet2")
	public Object[][] getYourData()
	{

		Object[][] yourData = new Object[2][2];
		
		yourData[0][0] = "UName11";
		yourData[0][1] = "Passwd";
	
		yourData[1][0] = "UName22";
		yourData[1][1] = "Passwd22";

		return yourData;
	
	}
	
	//Third Data provider
	@DataProvider(name="DataSet3")
	public Object[][] getOurData()
	{
		Object[][] ourData = new Object[2][3];
		
		ourData[0][0] = "User111" ;
		ourData[0][1] = "Passw111";
		ourData[0][2] = "Chrome111";
		
		ourData[1][0] = "User222";
		ourData[1][1] = "Passw222";	
		ourData[1][2] = "Firefox222";
		
		return ourData;
	}
	
}
