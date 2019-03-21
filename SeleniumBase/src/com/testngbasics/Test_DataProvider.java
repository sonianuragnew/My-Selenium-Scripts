package com.testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Test_DataProvider {
	WebDriver d ;
	
	@Test(dataProvider="loginCredentials")
	public void crmLogin(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");		d= new ChromeDriver();
		d.get("https://classic.crmpro.com/login.cfm");
	    d.findElement(By.name("username")).sendKeys(username);
	    Thread.sleep(400);
	    d.findElement(By.name("password")).sendKeys(password);
	    Thread.sleep(400);
	    d.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(1000);
	    d.quit();
	}
	@DataProvider(name="loginCredentials")
	   public Object[][] getData()
	   {
	    Object[][] credentials = new Object[3][2];
	
		credentials[0][0] = "anuragcrmtest";
		credentials[0][1] = "Mp05ae6173#";
		
		credentials[1][0] = "crmtestcredentials";
		credentials[1][1] = "test1234";
			
		credentials[2][0] = "invalid";
		credentials[2][1] = "1234456";
		
		return credentials;
	}	

}
