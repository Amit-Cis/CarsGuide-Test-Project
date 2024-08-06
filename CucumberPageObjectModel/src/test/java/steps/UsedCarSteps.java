package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.UsedCarPageActions;
import utilities.SeleniumDriver;

public class UsedCarSteps {

	UsedCarPageActions usedCarsPageActions=new UsedCarPageActions();
	
	@Given("^I am on \"([^\"]*)\" homepage of carsguide website$")
	public void i_am_on_homepage_of_carsguide_website(String websiteURL) {

		SeleniumDriver.openPage(websiteURL);
	}

	@When("I move to buy+sell menu")
	public void i_move_to_buy_sell_menu() {
	
		usedCarsPageActions.moveToBuyAndSellMenu();
	}

	@Then("I click on Used under Buy option")
	public void i_click_on_used_under_buy_option() {
		
		usedCarsPageActions.clickOnUsedOptionUnderBuyOption();
	}

	@Then("I select anymake")
	public void i_select_anymake(List<String> list) {
		String menu=list.get(1);
		System.out.println("menu value is:- "+menu);
		usedCarsPageActions.selectAnyMakeDropDown(menu);
	}

	@And("I select car model as {string}")
	public void i_select_model_as(String model) throws InterruptedException {

		Thread.sleep(1000);
		usedCarsPageActions.selectModelDropDown(model);
	}

	@Then("I select state as {string}")
	public void i_select_state_as(String state) {
		
		usedCarsPageActions.selectStateDropDown(state);
	}

	@Then("I select region as {string}")
	public void i_select_region_as(String region) {
		
		usedCarsPageActions.selectRegionDropDown(region);
	}

	@Then("I select minimum price as {string}")
	public void i_select_minimum_price_as(String min) {
	
		usedCarsPageActions.selectMinimumPriceDropDown(min);
	}
	
	@Then("I select maximum price as {string}")
	public void i_select_maximum_price_as(String max) {
	
		usedCarsPageActions.selectMaximumPriceDropDown(max);
	}

	@Then("I click on Show me used vehicles button")
	public void i_click_on_show_me_used_vehicles_button() {

		usedCarsPageActions.clickOnShowMeUsedVehiclesButton();
	}

	@Then("I should see list of searched cars from filters")
	public void i_should_see_list_of_searched_cars() throws InterruptedException {

		Thread.sleep(2000);
		boolean flag=usedCarsPageActions.verifyingSearchResultIsAccurate();
		Assert.assertTrue(flag);
	}

	@And("The page title should be shown as {string}")
	public void the_page_title_should_be(String expectedTitle) {

		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
