package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.SeleniumDriver;

public class AfterAction {

	@After
	public void tearDown(Scenario scenario)
	{
		WebDriver driver=SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] ss=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "images/png","screenshot");
//			byte[] screenShotBytes=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenShotBytes, "images/png","screenshot");
		}
		else {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] ss=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss, "images/png","screenshot attached");
		}
		SeleniumDriver.tearDown();
	}
}
