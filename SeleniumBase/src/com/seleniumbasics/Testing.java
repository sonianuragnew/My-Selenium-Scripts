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
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
	d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	d.manage().window().maximize();
	d.get("https://jqueryui.com/droppable/");
	
	}

}
