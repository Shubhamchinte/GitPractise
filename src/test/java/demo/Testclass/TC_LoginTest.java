package demo.Testclass;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo.POMclass.LoginPage;

public class TC_LoginTest extends BaseClass
{
	@Test
	public void login() throws InterruptedException
	{
		driver.get(URL);
		logger.info("url is opened");
		Thread.sleep(5000);
		LoginPage lp=new LoginPage(driver);
		lp.sendUsername(Username);
		logger.info("Entered Username");
		Thread.sleep(500);
		lp.sendpassword(Password); 
		logger.info("Entered Password");
		lp.clickonlogin();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}

}
