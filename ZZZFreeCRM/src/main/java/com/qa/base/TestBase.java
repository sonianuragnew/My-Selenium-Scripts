package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

/*1.Base class will WebDriver object which will be public 
2.Base class will have constructor which will initialize Property file object 
3.Base class also will have a method for launching the browser and opening URL */	

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
//TestBase class will have a constructor to initialize and read the properties 
	public TestBase()
	{ 	
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\xbbnd0r\\workspace\\ZZZFreeCRM\\src\\main\\java\\com\\qa\\config\\configuration.properties");
			prop.load(fis);		
		}
		catch (Exception e)
		{
			e.printStackTrace();		
		}
	}
		
//A method for initializing the browser and and loading the URL
	public static void openBrowser()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		 	driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("appurl"));
	} 
	
	public static void closeBrowser()
	{
		driver.close();
	}
}
