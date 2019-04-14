package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Calendar {

	static WebDriver d ;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.redbus.in/");
		
		//This will click on the Departure date calendar  
		d.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Thread.sleep(800);
		
		String expMonth = "Sept 2019";
		
		// This will give the currently selected month
		String currMonth =d.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText();
		
		// This will click on the next button in calendar
		d.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='next']")).click();
		
		if(expMonth.equalsIgnoreCase(currMonth))
		{
			System.out.println("Desired month is already Selected");
		}
		else
		{
			for(int i=1; i<12; i++)
			{
				//Keep on clicking next button until current month is not equal to expected month 
				d.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='next']")).click();
				Thread.sleep(800);
				
				//Get the text for the month when current month is equal to expected month
				currMonth =d.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText();
				if(expMonth.equalsIgnoreCase(currMonth))
				{
					System.out.println("Desired month is selected");
					break;
				}
			}	
		}
		
		Thread.sleep(800);
		
		//This will have the whole calendar
		WebElement calendar = d.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tbody"));
		
		//This will have all the dates from the above selected calendar
		List<WebElement> alldates = d.findElements(By.tagName("td"));
		
		for(int i =0; i<alldates.size(); i++)
		{
			String jrnyDate =alldates.get(i).getText();
			if(jrnyDate.equals("12"))
			{
				alldates.get(i).click();
				System.out.println("Hurray! Journey date is selected");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
