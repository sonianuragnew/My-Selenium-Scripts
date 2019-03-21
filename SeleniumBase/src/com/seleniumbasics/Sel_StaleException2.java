package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_StaleException2 {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.cricbuzz.com");
		
		WebElement scoreArea = d.findElement(By.xpath("//div[@class='cb-col-100 cb-col cb-hm-scg-blk ']"));
		
		List<WebElement> matches = scoreArea.findElements(By.tagName("a"));
		System.out.println("Total number of scorecards "+matches.size());
		
		for(int i =0 ; i<matches.size();i++)
		{
			System.out.println(matches.get(i).getText());
			System.out.println("=============================================================================");
			matches.get(i).click();
			Thread.sleep(3000);
			System.out.println("Page Title is "+d.getTitle());
		
		}
		
		
		d.quit();
		
	}

}
