package com.testngbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Basics {
	
	WebDriver d ;
	@BeforeSuite 
	public void runBeforSuite(){
		System.out.println("@Before Suite Method is called");
	}
	
	@BeforeTest
	public void runBeforeTest(){
		System.out.println("@Before Test Method is called");
		System.setProperty("webdriver.chrome.driver", "D:\\JavaSelenium\\Selenium Jar and Drivers\\BrowserDrivers\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void setupBrowser() {
		System.out.println("@Before Method is called");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://classic.crmpro.com/login.cfm");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("After Method call for browser instance closing");
		d.quit();
	}
	
	@Test(priority=1, description="Verify the login functionality")
	public void verifyLogin() throws InterruptedException{
		
	WebElement username = d.findElement(By.name("username"));
	username.sendKeys("anuragcrmtest");
	Thread.sleep(700);
	
	WebElement password = d.findElement(By.name("password"));
	password.sendKeys("Mp05ae6173#");
	Thread.sleep(700);
	
	WebElement submit = d.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	Thread.sleep(700);
	
	String actTitle = d.getTitle();
	System.out.println("After login, The page Title is : "+actTitle);
	
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(actTitle, "CRMPRO", "Page Tile is not Matching");
	sa.assertAll();
	}
	
	@Test(dependsOnMethods="verifyLogin", priority=2, description="Verify the contact page")
	public void verifyContacts() throws InterruptedException{
	verifyLogin();
	Thread.sleep(700);
	d.switchTo().frame("mainpanel");
	Thread.sleep(700);
	WebElement contacts = d.findElement(By.xpath("//a[text()='Contacts']"));
	Thread.sleep(700);
	contacts.click();
	Thread.sleep(700);
	}

	@Test(dependsOnMethods="verifyLogin", priority=3, description="Verify the logout functionality")
	public void verifyLogout() throws InterruptedException{
	verifyLogin();
	Thread.sleep(700);
	d.switchTo().frame("mainpanel");
	d.findElement(By.xpath("(//a[@class='topnavlink'])[1]")).click();
	Thread.sleep(700);	
	}
	
	@AfterTest
	public void runAfterTest(){
		System.out.println("@After Test Method is called");
	}
	
	@AfterSuite 
	public void runAfterSuite(){
		System.out.println("@After Suite Method is called");
	}

}
 