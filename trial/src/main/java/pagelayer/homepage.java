package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class homepage extends TestBase {

	@FindBy(linkText="Go to Federal Hierarchy >")
	WebElement FHlink;
	
	

	public homepage() {
		PageFactory.initElements(driver, this);

	}

public void getintoFH(){
	
	FHlink.click();
	
}





}