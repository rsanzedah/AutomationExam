package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefintion {
	WebDriver driver;
	
	@Given("user in page")
	public void user_in_page() {
		System.setProperty("webdriver.gecko.driver", "\\C:\\SeleniumWebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://techfios.com/test/104/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //pageloadouttime coming from util class
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicitywait coming from util class 
		

	  
	}

	@Then("user clicks on Set SkyBlue background")
	public void user_clicks_on_Set_SkyBlue_background() {
	   driver.findElement(By.xpath("//button[text()='Set SkyBlue Background']")).click();
	   
	}

	@Then("users page turns blue")
	public void users_page_turns_blue() {
	   driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).isDisplayed();
	   }

	@Given("users in page")
	public void users_in_page() {
		System.setProperty("webdriver.gecko.driver", "\\C:\\SeleniumWebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://techfios.com/test/106/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //pageloadouttime coming from util class
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicitywait coming from util class 
		

		}

	@Then("user clicks on Set white background")
	public void user_clicks_on_Set_white_background() {
		driver.findElement(By.xpath("//button[@onclick='myFunctionWhite()']")).click();
		
	  
	}

	@Then("users page turns white")
	public void users_page_turns_white() {
		driver.findElement(By.xpath("//body[@style='background-color: white;']")).isDisplayed();
	  
	    
	    
	}
	
}


