package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_DrogNDrop {

	static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		
		d.switchTo().frame("demo-frame");
		
		WebElement src = d.findElement(By.id("draggable"));
		WebElement dst = d.findElement(By.xpath("droppable"));
		
//Method 1
		
		Actions act = new Actions(d);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(1000);
//Method 2
		//act.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		
		
		
		

	}

}
