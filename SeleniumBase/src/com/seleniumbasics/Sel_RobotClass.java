package com.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_RobotClass {
	
	static WebDriver d;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");		
		d= new ChromeDriver();
		d.get("https://my.indeed.com/resume?from=hp&subfrom=rezprmstd&trk.origin=hp&trk.variant=rezprmstd&trk.tk=1d5sbcubq9cqc801&co=IN&hl=en_IN&obo=https%3A%2F%2Fwww.indeed.co.in");
		d.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		StringSelection ss = new StringSelection("C:\\Users\\xbbnd0r\\Downloads\\excelData.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
