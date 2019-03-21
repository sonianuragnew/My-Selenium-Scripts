package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {
	
	static WebDriver d ;
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
	d = new ChromeDriver();
	d.manage().window().maximize();
	//d.get("https://selenium-vinod.blogspot.com/p/task1.html");
	
	/*Actions action= new Actions(d);
	action.contextClick(d.findElement(By.xpath("//input[@type='submit']"))).build().perform();
	
	Thread.sleep(1000);
	JavascriptExecutor jse = ((JavascriptExecutor) d);
	jse.executeScript("scroll(0,800)");
	Thread.sleep(1000);
	jse.executeScript("scroll(800,00)");*/
	
	/*JavascriptExecutor js = (JavascriptExecutor)d ;
	Integer test = (Integer)js.executeScript("return document.images");
	System.out.println(test);*/
	
	JavascriptExecutor js = (JavascriptExecutor)d ;
	js.executeScript("window.open('https://www.google.com')");
	
	
	
	Thread.sleep(1000);
	d.close();
	
	}

}
