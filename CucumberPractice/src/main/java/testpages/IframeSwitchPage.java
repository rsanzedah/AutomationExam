package testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class IframeSwitchPage extends TestBase{

	//Page Factory
	@FindBy(xpath="//a[@title=\"SQL Tutorial\"]")
	WebElement SQLButton;
	
	@FindBy(xpath="//a[@title=\"PHP Tutorial\"]")
	WebElement PHPButton;
	
	@FindBy(how=How.XPATH, using="//a[@href='php_intro.asp']")
	WebElement PHPValidation;
	
	@FindBy(how=How.XPATH, using="//a[@href='sql_intro.asp']")
	WebElement SQLValidation;
	
	@FindBy(xpath="//iframe[@src=\"default.asp\"]")
	WebElement iFrame;
	
	//initialize Page factory in this constructor
	public IframeSwitchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SwitchiFrame() {
		driver.switchTo().frame(iFrame);
	}
	
	public void clickSQLButton() {
		SQLButton.click();
	}
	
	public boolean OnSQLPage() {
		return SQLValidation.isDisplayed();
	}
	
	public void SwitchBackiFrame() {
		driver.switchTo().parentFrame();
	}
	
	public void clickPHPButton() {
		PHPButton.click();
	}
	
	public boolean OnPHPPage() {
		return PHPValidation.isDisplayed();
	}

}
