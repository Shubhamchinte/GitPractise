package demo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//input[@name='uid']")
	WebElement Username;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Login;
	
	public void sendUsername(String name)
	{
		Username.sendKeys(name);
	}
	public void sendpassword(String password)
	{
		Password.sendKeys(password);
	}
	public void clickonlogin()
	{
		Login.click();
	}

}
