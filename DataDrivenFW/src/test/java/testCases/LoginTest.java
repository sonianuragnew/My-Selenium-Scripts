package testCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectrepository.LoginPage;


public class LoginTest  extends LoginPage{
	
	WebDriver driver ;
	Properties prop;
	LoginPage lg = new LoginPage(d);
	
	public LoginTest() 
	{
		super(d);	
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{

    FileInputStream fis = new FileInputStream("C:\\Users\\xbbnd0r\\workspace\\DataDrivenFW\\src\\test\\resources\\env.properties");
    prop = System.getProperties();
    prop.load(fis);	
	System.setProperty("webdriver.chrome.driver", "D:\\JavaSelenium\\Selenium Jar and Drivers\\BrowserDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
   	}
    
    @Test(priority=0)
    public void login_crm() throws IOException
    {
    	
      //prop.getProperty("url");
      //driver.get();
        lg.Veriy_login();         
    }
    

    @Test()
    public void logout_crm()
    {
    	lg.Logout();	
    }
}
