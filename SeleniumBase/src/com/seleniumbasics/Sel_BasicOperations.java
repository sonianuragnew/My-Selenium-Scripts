package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_BasicOperations {
		
	static WebDriver d ;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		//d.get("https://www.freecrm.com/index.html");
		d.get("https://www.freecrm.com/register/");
		//
		//Reading Font Properties
		WebElement text = d.findElement(By.id("fname"));
		String fontColor = text.getCssValue("color");
		String fontFamily = text.getCssValue("font-family");
		String fonttxtAlign = text.getCssValue("text-align");
		
		
		/*d.get("https://www.freecrm.com/index.html");
		not working  ul[@class='nav navbar-nav navbar-right']/li[2]/a
		
		
//clicking Sign Up button
		WebElement signupBtn = d.findElement(By.linkText("Sign Up"))
		signupBtn.click(); */

//Handling drop down
		WebElement editionDd = d.findElement(By.xpath("//select[@id='payment_plan_id']"));
		Select sel = new Select(editionDd);
	
		List<WebElement> li = sel.getOptions();
		System.out.println("Total values in Edition drop down are "+li.size());
		
		for(int i =0; i<li.size(); i++)
		{
			System.out.println("Drop down values are "+li.get(i).getText());
		}
		
		sel.selectByIndex(1);
		Thread.sleep(700);
		
//Handling text field
		WebElement firstName = d.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys("Anurag");
		Thread.sleep(500);
		WebElement lastName = d.findElement(By.xpath("//input[@name='surname']"));
		lastName.sendKeys("Soni");
		Thread.sleep(500);
		WebElement email = d.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("anurag_soni444@yahoo.co.in");
		Thread.sleep(500);
		WebElement emailCon = d.findElement(By.xpath("//input[@name='email_confirm']"));
		emailCon.sendKeys("anurag_soni444@yahoo.co.in");
		Thread.sleep(500);
		WebElement userName = d.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("crmtestcredentials");
		Thread.sleep(500);
		WebElement password = d.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("test1234");
		Thread.sleep(500);
		WebElement passwordCon = d.findElement(By.xpath("//input[@name='passwordconfirm']"));
		passwordCon.sendKeys("test1234");
		Thread.sleep(500);
		
		
		/*WebElement tncPage = d.findElement(By.xpath("//a[text()='terms and conditions']"));
		tncPage.click();
		Thread.sleep(1000);
		d.navigate().back(); */
//Clicking the Check Box		
		
		d.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		Thread.sleep(1000);
		
		WebElement submitBtn = d.findElement(By.xpath("//div[@class='myButton']"));
		submitBtn.click();
		
		
		Thread.sleep(3000);
		
		//d.quit();
		
	}

}
