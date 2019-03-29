package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dos {
	

	@FindBy(xpath="//input[@name=\'categorydata\']")
	WebElement dataNo;
	@FindBy(xpath="//input[@type='submit' and @value='Add category' and @name='submit']")
	WebElement cat1;
	@FindBy(xpath="//body[text()='The category you want to add already exists:   		']")
	WebElement no;
	
	public void Anotherpage() {
		
		dataNo.sendKeys("test100");
		cat1.click();
		no.isDisplayed();
		
		
	}
	
	}
