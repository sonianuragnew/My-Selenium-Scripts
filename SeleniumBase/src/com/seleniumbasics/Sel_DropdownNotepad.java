package com.seleniumbasics;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_DropdownNotepad {
	
	static WebDriver d;
	static int i;

	public static String readCityValue()
	{
		try
		{
		FileInputStream fis = new FileInputStream("C:\\Users\\xbbnd0r\\workspace\\SeleniumBase\\src\\com\\seleniumbasics\\dropdownValues.txt");
		 while((i=fis.read())!= -1)
		  {
			System.out.print((char)i);
		  } 
		}
		catch (Exception e)
		  {
			e.printStackTrace();
		  }
		
		return null;
		
	}	
	
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\JavaSelenium\\Selenium Jar and Drivers\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("");*/
		Sel_DropdownNotepad.readCityValue();
	}

}
