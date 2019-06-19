package pagelayer;
import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.By;
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
	@FindBy(id=("user_email"))
	WebElement Email;
	@FindBy(id=("user_password"))
	WebElement Password;
	@FindBy(className=("btn-primary"))
	WebElement Next;
	@FindBy(className=("btn-primary"))
	WebElement Submit;
	@FindBy(xpath="//input[@class=\"btn btn-primary btn-wide\" and @value=\"Continue\"]")
	WebElement Continue;
	
	
	
	
	//intializing the page objects/elements/
	//means DRIVER PLEASE INTILZE ALL THE GLOBAL VARIABLES ABOVE
	public loginpage () {
		PageFactory.initElements(driver, this);
	}
	
	
	//METHODS/ACTIONS
	
	public  void validateloginpage() {
		driver.getTitle();
		
	}
	
	
		public void tryingtosignin() throws InterruptedException {
			signin.click();
			Thread.sleep(30);
		}
		public void enteremail() throws InterruptedException  {
			Email.sendKeys("sanzedah.rahman+domainadmin@gsa.gov");
			Thread.sleep(30);
			
			
		}
			public void enterpassword() throws InterruptedException  {
				Password.sendKeys("trialanderror");
				Thread.sleep(30);
				
			
			
		}
		public void closealert() throws InterruptedException {
			popup.click();
			Thread.sleep(30);
		}
		public void clicknextbutton() throws InterruptedException {
			Next.click();
			Thread.sleep(30);
		}
		public static String getotp(String secretkey )     {
		//String secretkey = "6BSLNLLRH7HLJFMM"; // <- this 2FA secret key.

				Totp totp = new Totp( secretkey);
				return totp.now();

		
			
		}
		public static void enterOtp(String otp) throws InterruptedException {
			driver.findElement(By.id("code")).sendKeys(otp);
			Thread.sleep(30);
		}
		public void clickOtpSubmit() throws InterruptedException {
			Submit.click();
			Thread.sleep(30);
			
		}
		public void clickContinue() throws InterruptedException {
			Continue.click();
			Thread.sleep(30);
			
		}
	}
	
	
	

