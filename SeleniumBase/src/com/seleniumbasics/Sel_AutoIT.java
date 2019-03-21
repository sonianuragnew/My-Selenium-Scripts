package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_AutoIT {

	static WebDriver d ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.indeed.co.in/");
		
		WebElement uploadResume = d.findElement(By.xpath("//a[text()='Upload Your Resume']"));
		WebDriverWait wait = new WebDriverWait(d, 5);
		wait.until(ExpectedConditions.visibilityOf(uploadResume));
		uploadResume.click();
		
		WebElement resUpload = d.findElement(By.xpath("//button[text()='Upload Resume']"));
		WebDriverWait w = new WebDriverWait(d, 5);
		w.until(ExpectedConditions.visibilityOf(resUpload));
		resUpload.click();
			
		
	}

}
