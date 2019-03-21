package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_ExplicitWait {

	static WebDriver d;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
			d = new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			d.manage().window().maximize();
			//d.get("https://www.freecrm.com/index.html");
			d.get("http://portfolio.rediff.com/portfolio-login");
			
			d.findElement(By.id("useremail")).sendKeys("onu_786");
			
			d.findElement(By.id("emailsubmit")).click();
			
			d.findElement(By.id("userpass")).sendKeys("testing");
			
			
			
			

	}

}
