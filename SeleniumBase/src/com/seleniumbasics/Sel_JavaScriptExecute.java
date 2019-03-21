package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_JavaScriptExecute {

	static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.google.com");
		
		//getting the domain name
		JavascriptExecutor js1 = (JavascriptExecutor) d;
		String CurrentURLUsingJS=(String)js1.executeScript("return document.domain");
		System.out.println(CurrentURLUsingJS);
	
		//displaying the alert
		JavascriptExecutor js2 = (JavascriptExecutor) d;
		js2.executeScript("alert('Starting test execution');");
		
		//Wait for page to lead/readyn 
		JavascriptExecutor js3 = (JavascriptExecutor)d;
		js3.executeScript("return document.readyState").toString().equals("complete");

		//Send keys using java script
		JavascriptExecutor js4 = (JavascriptExecutor)d;
		js4.executeScript("document.getElementById('fname').value='Using JavascriptExecutor'");
		
		//Scrolling a page
		JavascriptExecutor js5 = ((JavascriptExecutor) d);
		js5.executeScript("scroll(0,400)"); //Scroll down
		Thread.sleep(1000);
		js5.executeScript("scroll(400,0)"); //Scroll up
		
		
		

	}

}
