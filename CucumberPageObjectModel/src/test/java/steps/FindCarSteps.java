package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.FindCarHomepageActions;
import utilities.SeleniumDriver;

public class FindCarSteps {

	FindCarHomepageActions findCarHomepageActions = new FindCarHomepageActions();

	@Given("^I am on homepage \"([^\"]*)\" of carsguide website$")
	public void i_am_on_homepage_of_carsguide_website(String websiteURL) {

		SeleniumDriver.openPage(websiteURL);
	}

	@When("I move to Find your next car heading")
	public void i_move_to_find_your_next_car_heading() {
		boolean flag=findCarHomepageActions.verifyingHeadingForFindingNextCar();
	Assert.assertTrue(flag);
	}

	@Then("I select make as {string}")
	public void i_select_make_as(String brand) {
		findCarHomepageActions.moveToAnymakeDropDown(brand);
	}

	@And("I select model as {string}")
	public void i_select_model_as(String model) {
		findCarHomepageActions.moveToModelDropDown(model);
	}
	
	@And("I validate the color of Show me button")
	public void i_validate_the_color_of_Show_me_button()
	{
		String expectedColor=findCarHomepageActions.verifyingShowButtonBGColor();
		Assert.assertEquals(expectedColor, "#8b84d7","Color not matching");
	}

	@And("I click on Show me button")
	public void i_click_on_show_me_button() {

		findCarHomepageActions.clickOnShowButton();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() throws InterruptedException {
		
		//Thread.sleep(3000);
		boolean flag=findCarHomepageActions.verifyingSearchResultIsAccurate();
		Assert.assertTrue(flag);
	}

	@And("The page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {

		String actualTitle=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
