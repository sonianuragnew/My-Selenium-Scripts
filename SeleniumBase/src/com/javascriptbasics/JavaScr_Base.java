package com.javascriptbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScr_Base {
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		//d.manage().window().maximize();
		d.get("https://www.w3schools.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		//1. Opening a browser window 
		//js.executeScript("window.open('https://s1.demo.opensourcecms.com/wordpress/wp-login.php')");
		
		//2. Getting current domain name
		String domain = (String)js.executeScript("return window.document.domain");
		System.out.println("Document/WebPage domain is ===> "+domain);
	
		//3. Getting the Title of the page
		String title = (String)js.executeScript("return window.document.title");
		System.out.println("Document/WebPage Title is ===> "+title);
		
		//4. Getting the current URL
		String url = (String)js.executeScript(" return window.document.URL");
		System.out.println("URL of the Document/WebPage is ===> "+url);
		
		//5. State of the page
		String state = (String)js.executeScript("return window.document.readyState");
		System.out.println("State of the document/WebPage is ===> "+state);
		
		js.executeScript("window.document.getElementByClassName('w3-button w3-dark-grey').click()");
		
		
		
		
		
		
		/*//Alerts
		js.executeScript("window.alert('Testing JavaScript')");
		Thread.sleep(1000);*/
	

	}

}
