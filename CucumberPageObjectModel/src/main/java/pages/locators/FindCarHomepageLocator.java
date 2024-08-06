package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindCarHomepageLocator {

	@FindBy(how=How.XPATH,using="//select[@id='makes']")
	public WebElement anyMakeDropDown;
	@FindBy(how=How.XPATH,using="//select[@id='models']")
	public WebElement modelDropDown;
	@FindBy(how=How.XPATH,using="//button[@type='button']")
	public WebElement showButton;
	@FindBy(how=How.XPATH,using="//span[contains(@class,'mmv')]")
	public WebElement searchResult;
	@FindBy(how=How.XPATH,using="//h3[@class='widget-heading']")
	public WebElement findCarHeading;
}
