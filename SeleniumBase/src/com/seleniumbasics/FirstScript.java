package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
		static WebDriver d ;
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			d.manage().window().maximize();
			d.get("https://www.google.in/");
	}

}
