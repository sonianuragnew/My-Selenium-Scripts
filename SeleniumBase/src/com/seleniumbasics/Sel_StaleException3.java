package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_StaleException3 {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.cnn.com");
		
		WebElement newsArea = d.findElement(By.xpath("//ul[@data-vr-zone='home-top-col3']"));
		
		List<WebElement> news = newsArea.findElements(By.tagName("a"));
		System.out.println("Total number of news links "+news.size());
		
		for(int i =0 ; i<news.size();i++)
		{
			System.out.println(news.get(i).getText());
			System.out.println("=============================================================================");
			news.get(i).click();
			Thread.sleep(3000);
			System.out.println("Page Title is "+d.getTitle());
		
		}
		
	
		
	}

}
