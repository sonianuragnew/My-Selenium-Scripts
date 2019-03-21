package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {	

//loginPage.Java class has 3 main things. 1. All the locators(objects) of the login page.
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	WebElement crmLogo;

//2. A constructor to initialize all the locators or  page objects written above.

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//3. Actions in form of different methods.
		
	public boolean validateLogo()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage validateLogin(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf((driver.findElement(By.xpath("//input[@type='submit']")))));
		loginbtn.click();
		
		return new HomePage();
	}
 
}
