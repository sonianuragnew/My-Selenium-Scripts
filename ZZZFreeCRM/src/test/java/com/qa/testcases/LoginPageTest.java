package com.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		openBrowser();
		loginpage = new LoginPage();
	}
	@Test(priority=1, description= "TC01_Verify the logo")
	public void verifyLogoTest()
	{
		boolean flag = loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=2, description= "TC02_Verify login functionality")   
	public void verifyLoginTest()
	{
		homepage = loginpage.validateLogin(prop.getProperty("userid"), prop.getProperty("password"));	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
