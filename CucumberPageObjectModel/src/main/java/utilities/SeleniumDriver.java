package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDriver {

	private static SeleniumDriver seleniumdriver;
	private static WebDriver driver;
	
	private SeleniumDriver()
	{
	   System.setProperty("webdriver.chrome.driver","/home/cis/Downloads/chromedriver-linux64/chromedriver");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}
	public static void openPage(String url)
	{
		driver.get(url);
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	public static void setUpDriver()
	{
		if(seleniumdriver==null)
		{
			seleniumdriver=new SeleniumDriver();
		}
	}
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumdriver=null;
	}

}
