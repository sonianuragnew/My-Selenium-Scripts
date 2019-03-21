package com.testngbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Parameterization {
	
	WebDriver d;
	
	@Test
	@Parameters({"url", "username", "password"})
	public void crmLogin(String url, String username, String password) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\JavaSelenium\\Selenium Jar and Drivers\\BrowserDrivers\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	d.manage().window().maximize();
	
	d.get(url);
	d.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(400);
	d.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(400);
	d.findElement(By.xpath("//input[@type='submit']")).click();

	Thread.sleep(1000);
	d.quit();
	
	}
}
