package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarPageLocators;
import utilities.SeleniumDriver;

public class UsedCarPageActions {

	UsedCarPageLocators usedCarPageLocator=null;
	public UsedCarPageActions()
	{
		this.usedCarPageLocator=new UsedCarPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarPageLocator);
	}
	public void moveToBuyAndSellMenu()
	{
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(usedCarPageLocator.moveToBuyAndSell).perform();
	}
	public void clickOnUsedOptionUnderBuyOption()
	{
		usedCarPageLocator.clickOnUsedLink.click();
	}
	public void selectAnyMakeDropDown(String brand)
	{
		Select select=new Select(usedCarPageLocator.usedCarAnyMakeDropDown);
		select.selectByVisibleText(brand);
	}
	public void selectModelDropDown(String model)
	{
		Select select=new Select(usedCarPageLocator.usedCarModelDropDown);
		select.selectByVisibleText(model);
	}
	public void selectStateDropDown(String state)
	{
		Select select=new Select(usedCarPageLocator.usedCarStateDropDown);
		select.selectByVisibleText(state);
	}
	public void selectRegionDropDown(String region)
	{
		Select select=new Select(usedCarPageLocator.usedCarRegionDropDown);
		select.selectByVisibleText(region);
	}
	public void selectMinimumPriceDropDown(String minPrice)
	{
		Select select=new Select(usedCarPageLocator.minPriceDropDown);
		select.selectByVisibleText(minPrice);
	}
	public void selectMaximumPriceDropDown(String maxPrice)
	{
		Select select=new Select(usedCarPageLocator.maxPriceDropDown);
		select.selectByVisibleText(maxPrice);
	}
	public void clickOnShowMeUsedVehiclesButton()
	{
		usedCarPageLocator.showUsedVehicleBtn.click();
	}
	public boolean verifyingSearchResultIsAccurate()
	{
		
	  return usedCarPageLocator.usedCarSearchResult.getText().contains("BMW");
	}
}
