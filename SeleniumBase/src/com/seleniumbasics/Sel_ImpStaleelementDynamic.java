package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_ImpStaleelementDynamic {
	
	public static WebDriver d;
	
	public static void main(String[] args) {
		// section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[1]/article/div/div[2]/h3/a
		// section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[2]/article/div/div/h3/a
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.navigate().to("https://www.cnn.com");
		
		String path1 = "//section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String path2 = "]/article/div/div/h3/a";
		
//Dynamic way of handling link count : we will not hard code the count of the links, instead we will click the link if
//they are present. so if we can check the presence of link then we can click on it 
		int i=1;
		while(isElementPresent(path1+i+path2, "xpath"))
		{
			WebElement linkelement = d.findElement(By.xpath(path1+i+path2));
			linkelement.click();
			d.navigate().back();
			i++;
		}
		
		}
		
		public static boolean isElementPresent(String locator, String locatorType)
		{
			WebElement element = null;
			if(locatorType.equals("xpath"))			
			{
				element = d.findElement(By.xpath(locator));
			}else if(locatorType.equals("id"))
			{
				element = d.findElement(By.id(locator));
			}else if(locatorType.equals("name"))
			{
				element = d.findElement(By.name(locator));	
			}else if(locatorType.equals("tagname"))
			{
				element = d.findElement(By.name(locator));	
			}
			
			if(element.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
	     
			
		}
				

}
