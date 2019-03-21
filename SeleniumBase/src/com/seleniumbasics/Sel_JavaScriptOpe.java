package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_JavaScriptOpe {

	public static WebDriver d; 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		d.get("https://www.freecrm.com/index.html");
		WebElement logo = d.findElement(By.xpath("//img[@alt='free crm logo']"));
		drawBorder(logo, d);
	}

	public static void drawBorder(WebElement element, WebDriver driver)
	{
	 JavascriptExecutor js = ((JavascriptExecutor)d);
	 js.executeScript("arguments[0].style.border= 5px solid red",element);		
	}

}
