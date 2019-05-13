package stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testbase.TestBase;
import testpages.IframeSwitchPage;

public class IframeSwitchStepDef extends TestBase{
	
	IframeSwitchPage IFPage;
	
	@Before
	public void Setup() {
		initil();
		IFPage = new IframeSwitchPage();
	}

	@Given("Frame Page I switch to sql frame")
	public void frame_Page_I_switch_to_sql_frame() {
	    IFPage.SwitchiFrame();
	}

	@Then("I click on SQL tab")
	public void i_click_on_SQL_tab() {
	    IFPage.clickSQLButton();
	}

	@Then("I validate SQL Frame")
	public void i_validate_SQL_Frame() {
	    Assert.assertTrue(IFPage.OnSQLPage());
	}

	@Then("I will switch to the main frame")
	public void i_will_switch_to_the_main_frame() {
	    IFPage.SwitchBackiFrame();
	}

	@Then("click PHP link")
	public void click_PHP_link() {
	    IFPage.clickPHPButton();
	}

	
	@Then("validate PHP link")
	public void validate_PHP_link() {
	   Assert.assertTrue(IFPage.OnPHPPage());
	}
	
	@After
	public void close() {
		driver.quit();
	}
	
}
