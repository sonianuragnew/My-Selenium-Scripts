package com.seleniumbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_MouseHover2 {

		public static WebDriver d;
		public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			d.manage().window().maximize();
			d.navigate().to("https://www.cricbuzz.com/");
			
			WebElement series = d.findElement(By.xpath("//a[text()='Series']"));
			Actions act = new Actions(d);

//Hovering over Series link
			act.moveToElement(series).perform();
			Thread.sleep(500);		
			List<WebElement> allsereies = d.findElements(By.xpath("//div[@id='seriesDropDown']/nav/a"));
			System.out.println("Number of ongoing series are : "+allsereies.size());
			System.out.println("===================================================================");
			for(int i=0 ; i<allsereies.size(); i++)
			{
				System.out.println(allsereies.get(i).getText());
				Random r = new Random();
				WebElement randomseries = allsereies.get(r.nextInt(allsereies.size()));
				randomseries.click();
				Thread.sleep(700);	
				d.navigate().back();
				
				Vector v = new Vector ();
				ArrayList al = new
				
			}		
			
	}

}
