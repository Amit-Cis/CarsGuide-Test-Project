package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarPageLocators {

	@FindBy(how=How.XPATH,using="//a[text()='buy + sell']")
	public WebElement moveToBuyAndSell;
	@FindBy(how=How.XPATH,using="//a[text()='Used']")
	public WebElement clickOnUsedLink;
	@FindBy(how=How.XPATH,using="//select[@id='make']")
	public WebElement usedCarAnyMakeDropDown;
	@FindBy(how=How.XPATH,using="//select[@id='model']")
	public WebElement usedCarModelDropDown;
	@FindBy(how=How.XPATH,using="//select[@id='state']")
	public WebElement usedCarStateDropDown;
	@FindBy(how=How.XPATH,using="//select[@id='region']")
	public WebElement usedCarRegionDropDown;
	@FindBy(how=How.XPATH,using="//select[@id='priceFrom']")
	public WebElement minPriceDropDown;
	@FindBy(how=How.XPATH,using="//select[@id='priceTo']")
	public WebElement maxPriceDropDown;
	@FindBy(how=How.XPATH,using="//div[@class='searchForm--formWrapper']//child::button")
	public WebElement showUsedVehicleBtn;
	@FindBy(how=How.XPATH,using="//span[@class='mmv']")
	public WebElement usedCarSearchResult;
	
}
