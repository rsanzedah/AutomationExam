package TestPages;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class FrontPage extends TestBase {


	@FindBy(xpath ="//*[@title='Women' and @class='sf-with-ul']")
	WebElement Woman;
	
	@FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/a")
	WebElement SummerDresses;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div")
	WebElement SummerDressesPageText;
	
	@FindBy(xpath = "//*[@id='selectProductSort']")
	WebElement Sort;
	
	@FindBy(xpath = "//*[@value='quantity:desc']")
	WebElement Stock;		
	
	@FindBy(id= "layered_category_4")
	WebElement Click;
	
	@FindBy(xpath= "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	WebElement PrintedSummerDress;
	
	@FindBy(xpath= "//select[@class='form-control attribute_select no-print']")
	WebElement SizeSort;
	
	@FindBy(xpath= "//*[@name='Submit']")
	WebElement AddCart;
	
	@FindBy(xpath= "//*[contains(@text(), 'Product successfully added to your shopping cart')]")
	WebElement AddedtoCart;
	
	public FrontPage() {
		PageFactory.initElements(driver, this); //this is gonna hold all our webelements
		
	}
	public void Hover() throws Exception {
		Actions actions = new Actions(driver);  //initiating the actions
		Thread.sleep(1000);
		actions.moveToElement(Woman).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(SummerDresses).perform();
		SummerDresses.click();
	}
	
	public boolean ValidateSummerDress() {
		return SummerDressesPageText.isDisplayed();
		
	}
	
	public void Box() {
		Click.click();
			
	}
	public void BuySummmerDress() {
		PrintedSummerDress.click();
	}
	public void AddtoCart() {
		AddCart.click();
	}
	public void SizeMedium() {
		Select Size = new Select(SizeSort);
		Size.selectByVisibleText("M");
		
		/*String[] allsizes = (String[]) Size.getOptions().toArray();
		
		for(int x=0;x<=allsizes.length;x++) {
			Size.selectByVisibleText(allsizes[x]);
			*/
		}
	public boolean VerifyCartWorks() {
		return AddedtoCart.isDisplayed();
		
	}
	}
	


	

