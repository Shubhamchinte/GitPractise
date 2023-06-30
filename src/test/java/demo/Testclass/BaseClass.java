 package demo.Testclass;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass 
{
	public String URL="https://demo.guru99.com/V1/index.php";
	public String Username="mngr472325";
	public String Password="hUzUpyn";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
		driver=new ChromeDriver();
		
		logger =Logger.getLogger("E-commerce");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	

}
