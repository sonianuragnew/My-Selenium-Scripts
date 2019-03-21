package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Notes:
1. Whenever an alert appears on the screen then it kind of freezes the control and focus gets shifted to the alert popup.
2. To handle alert popups, we use Alert interface with switchTo() method.
*/
public class Sel_AlertHandle {	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbbnd0r\\Downloads\\Selenium Setup\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		WebElement rediffmail = driver.findElement(By.xpath("//u[text()='rediffmail']"));
		rediffmail.click();
//capturing the main window title 
		String mainwindow = driver.getWindowHandle();
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='login1']"));
		userid.sendKeys("onu_Valid");
		Thread.sleep(800);
		WebElement gobutton = driver.findElement(By.xpath("//input[@type='submit']"));
		gobutton.click();
		Thread.sleep(1000);
//Moving the focus now to alert pop up, it is handled by Alert interface
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(1500);
		al.accept();
//switching control back to the main window
		driver.switchTo().window(mainwindow);		
		Thread.sleep(3000);
		driver.quit(); 
		
	}

}
