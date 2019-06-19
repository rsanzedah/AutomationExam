package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pagelayer.loginGov;
import pagelayer.loginpage;
import util.TestBase;
	

public class loginsteps extends TestBase{
	loginpage LoginPage;
	loginGov LoginGov;
	
	@Before
	public void Setup() {
		LoginPage = new loginpage();
		LoginGov=new loginGov();
	}
	
	@Given("user opens browser")
	public void user_opens_browser() {
	   TestBase.Initial();
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
		LoginPage= new loginpage();
	LoginPage.validateloginpage();
	
	//Assert.assertTrue(condition);
	//Assert.assertTrue(LoginPage.validateloginpage());
	String actualTitle=driver.getTitle();	
	System.out.println(actualTitle);
	String expectedTitle="beta.SAM.gov | Home";
	Assert.assertEquals(expectedTitle, actualTitle);
		   
	}

	@Then("user clicks signin")
	public void user_clicks_signin() throws Throwable {
		Thread.sleep(5000);
		
	   LoginPage.tryingtosignin();
	   Thread.sleep(5000);
	}

	@Then("user closes the pop up")
	public void user_closes_the_pop_up() throws Throwable {
		LoginPage.closealert();
		LoginGov=new loginGov();
		LoginGov.enteremail();
		LoginGov.enterpassword();
		LoginGov.clicknextbutton();
		String otp=LoginGov.getotp("6BSLNLLRH7HLJFMM");
		LoginGov.enterOtp(otp);
		LoginGov.clickOtpSubmit();
		Thread.sleep(5000);
		LoginGov.clickContinue();
	
	
	Thread.sleep(30);
	driver.close();
		
	}
	
	}
