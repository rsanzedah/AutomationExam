package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import util.TestBase;


public class loginsteps extends TestBase{
	@Given("user opens browser")
	public void user_opens_browser() {
	   TestBase.Initial();
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
	   
	}

	@Then("user clicks signin")
	public void user_clicks_signin() {
	   
	}

	@Then("user closes the pop up")
	public void user_closes_the_pop_up() {
	
	
	}
}