package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_MouseHover {
	public static WebDriver d;
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.cricbuzz.com/");
		
		WebElement series = d.findElement(By.xpath("//a[text()='Series']"));
		Actions act = new Actions(d);

//Hovering over Series link
		act.moveToElement(series).perform();
		Thread.sleep(500);

//A fraction of seconds is being taken for opening up the sub-menu
		WebElement indwomen = d.findElement(By.xpath("//a[text()='India Women tour of New Zealand, 2019']"));
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.visibilityOf(indwomen));
		
		//div[@id='seriesDropDown']/nav/a
		

//Click on team
		indwomen.click();

	}

}
