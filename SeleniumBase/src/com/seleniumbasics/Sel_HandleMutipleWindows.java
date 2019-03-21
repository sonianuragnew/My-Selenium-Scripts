package com.seleniumbasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_HandleMutipleWindows {
	
	static WebDriver d ;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://www.rediff.com");
		
		d.switchTo().frame("moneyiframe");
		
		WebElement addver = d.findElement(By.xpath("//div[@class='mw001-widget-getquote-btn']"));
		addver.click();
		
		Set<String> winid  = d.getWindowHandles();
		Iterator<String> it = winid.iterator();
		
		String parentwinid = it.next();
		System.out.println("Parent window id is : "+parentwinid);
		String childwinid = it.next();
		System.out.println("Child window id is : "+childwinid);
	
		d.switchTo().window(childwinid);
		
		d.findElement(By.xpath("//input[@name='srchword']")).sendKeys("Tata steels");
		Thread.sleep(600);
		
		d.findElement(By.xpath("//input[@class='msprite btn_srch']")).click();
			
		Thread.sleep(2500);
		d.close();
		
		Thread.sleep(2000);
		d.quit();
	
	}

}
