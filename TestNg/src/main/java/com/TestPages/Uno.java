package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class Uno extends TestBase {
	
	
	@FindBy(xpath="//input[@name=\'categorydata\']")
	WebElement data;
	
	@FindBy(xpath="//input[@type='submit' and @value='Add category' and @name='submit']")
	WebElement cat;
	
	@FindBy(xpath="//span[text()='category']")
	WebElement there;
	
	public Uno() { 
		PageFactory.initElements(driver, this);
}
	public void ClickRegister() {
		cat.click();
	
	}
	public void Enter(String name) {
		data.sendKeys(name);
	}
	public boolean yes() {
		return there.isDisplayed();
				
	}
		
		
	}



