package com.seleniumbasics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_GoogleSearch {

	public static WebDriver d; 
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.google.com");
		
		WebElement search =d.findElement(By.name("q"));
		search.sendKeys("Cyber Success");
		
		List<WebElement> allsuggestions = d.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Suggestions are : "+allsuggestions.size());
		
		/*Iterator<WebElement> it = allsuggestions.iterator();
		while (it.hasNext())
		{
			String suggestion = it.next().getText();
			System.out.println(suggestion);
			if(suggestion.equals("cyber success jobs"))
			{
				
			}
			
		}*/
		
		for(int i=0; i<allsuggestions.size();i++)
		{
			System.out.print(allsuggestions.get(i).getText());
			Thread.sleep(500);
			if(allsuggestions.get(i).getText().equals("cyber success jobs"))
			{
				allsuggestions.get(i).click();
				break; //staleElementReferenceException
			}
			
		}
		

	}

}
