package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	protected static  WebDriver d;
	
	@FindBy(xpath = "//input[@name='username']") 
	public WebElement username ;
	
	@FindBy(xpath = "//input[@name='password']") 
	public WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	public WebElement submitbtn;
	
	@FindBy(partialLinkText = "https://www.freecrm.com/index.cfm?logout=1")
	public WebElement logout;

	
	public LoginPage(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
   public void Veriy_login(){
	   
	   username.click();
	   username.sendKeys("anuragcrmtest");
	   password.click();
	   password.sendKeys("Mp05ae6173#");
	   submitbtn.click();
	   
   }
   
   public void Logout(){
	  logout.click();   
	   
   }
   
}

