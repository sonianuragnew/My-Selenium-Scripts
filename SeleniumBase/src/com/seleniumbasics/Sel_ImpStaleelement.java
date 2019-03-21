package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_ImpStaleelement {
	
	public static WebDriver d;
	public static void main(String[] args) {
		// section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[1]/article/div/div[2]/h3/a
		// section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[2]/article/div/div/h3/a
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		d.navigate().to("https://www.cnn.com");
		
		String path1 = "//section[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String path2 = "]/article/div/div/h3/a";
		
//static way of handling link count
		for(int i=1; i<10; i++)
		{
		WebElement linkele = d.findElement(By.xpath(path1+i+path2));
		linkele.click();
		System.out.println(linkele.getText());
		d.navigate().back();
		
		}
				
	}

}
