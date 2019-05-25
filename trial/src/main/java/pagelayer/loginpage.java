package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class loginpage extends TestBase {

	//locators WEBELEMENTS
	
	@FindBy(xpath="//button[@id=\"signin-button\"]")
	WebElement signin;
	@FindBy(xpath="//button[@class=\"sam-ui button primary\" and @type=\"button\"] ")
	WebElement popup;
	
	
	//intializing the page objects/elements/
	//means DRIVER PLEASE INTILZE ALL THE GLOBAL VARIABLES ABOVE
	public loginpage () {
		PageFactory.initElements(driver, this);
	}
	
	
	//METHODS/ACTIONS
	
	public  void validateloginpage() {
		driver.getTitle();
		
	}
	
	
		public void tryingtosignin() {
			signin.click();
			
		}
		public void closealert() {
			popup.click();
		}
		
			
		
	}
	
	
	

