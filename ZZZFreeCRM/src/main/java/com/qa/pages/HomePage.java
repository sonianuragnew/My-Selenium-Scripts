package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	@FindBy(xpath="//td[contains(text(),'Anurag')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

//constructor for initializing page objects
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
//Actions on Home Page
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public ContactsPage clickOnContactsLink()
	{
		contactsLink.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealsLink()
	{
		dealsLink.click();
		return new DealsPage()
	}
	public TaskPage clickOnTasksPage()
	{
		tasksLink.click();
		return new TaskPage();
	}



}
