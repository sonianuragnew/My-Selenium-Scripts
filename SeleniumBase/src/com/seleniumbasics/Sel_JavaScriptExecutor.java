package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_JavaScriptExecutor {

	public static WebDriver d;
	
	/*public static void drawBorder(WebElement element, WebDriver d)
	{ 
		JavascriptExecutor js = ((JavascriptExecutor)d);
		js.executeScript("arguments[0].style.border=7px solid red", element);
	}*/

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.freecrm.com/index.html");
		WebElement logo = d.findElement(By.xpath("//a[@class='navbar-brand']"));
		//drawBorder(logo, d);
	}	
	
}
