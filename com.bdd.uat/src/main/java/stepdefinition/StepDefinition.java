package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	
	
	@Given("user in login page")
	public void user_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanzedah Rahman\\git\\AutomationExam\\com.bdd.uat\\resources\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		
	}

	@Then("user enters \"(.*)\" and \"(.*)\"")
	public void user_enters_user_name_and_password(String username, String password) {
	   driver.findElement(By.id("username")).sendKeys(username);//this  all used to be hardcoded n code it shouldnt be hard coded.
	   driver.findElement(By.id("password")).sendKeys(password);
	}
 
	@Then("clicks on sign in button")
	public void clicks_on_sign_in_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("sucessfully signs in to homepage")
	public void sucessfully_signs_in_to_homepage() {
	   driver.findElement(By.xpath("//h2[text()='Dashboard ']")).isDisplayed();
	   driver.quit();
	}


}
