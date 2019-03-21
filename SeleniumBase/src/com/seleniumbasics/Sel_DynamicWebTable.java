package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_DynamicWebTable {
	
	public static WebDriver d; 
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.get("https://www.freecrm.com/index.html");
		
		WebElement username = d.findElement(By.name("username"));
		username.sendKeys("anuragcrmtest");
		Thread.sleep(800);
		WebElement password = d.findElement(By.name("password"));
		password.sendKeys("Mp05ae6173#");
		Thread.sleep(800);
		WebElement loginbtn = d.findElement(By.xpath("//input[@type='submit']"));
		loginbtn.click();
		
		d.switchTo().frame("mainpanel");
		
		WebElement contactstab = d.findElement(By.xpath("//a[text()='Contacts']"));
		contactstab.click();
		Thread.sleep(800);
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
		//*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]
		//*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]
		/*
	   	String beforexpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String afterxpath = "]/td[2]";
		
		for(int i=4 ; i<=11; i++)
		{
		  String name = d.findElement	(By.xpath(beforexpath + i + afterxpath )).getText();
		  System.out.println(name);
		  if(name.contains("DB Bhai"))
		  	{
				//*[@id="vContactsForm"]/table/tbody/tr[8]/td[1]/input
				//*[@id="vContactsForm"]/table/tbody/tr[9]/td[1]/input
				d.findElement(By.xpath("//input[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}*/

	//Method 2 
    	d.findElement(By.xpath("//a[text()='Nadeem Zaya']/parent::td//preceding-sibling::td/input")).click();	
		 
	}

}
