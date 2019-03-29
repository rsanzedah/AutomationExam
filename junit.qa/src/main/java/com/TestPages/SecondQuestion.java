package com.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SecondQuestion extends TestBase {

	@FindBy(name = "allbox")
	WebElement Toggle;
	@FindBy(name = "todo[3]")
	WebElement A;
	@FindBy(name = "todo[4]")
	WebElement B;
	@FindBy(name = "todo[5]")
	WebElement C;
	@FindBy(name = "todo[6]")
	WebElement D;
	@FindBy(name = "todo[2]")
	WebElement E;
	@FindBy(name = "todo[8]")
	WebElement F;
	@FindBy(name = "todo[9]")
	WebElement G;

	@FindBy(name = "submit")
	WebElement delete;
	@FindBy(name = "data")
	WebElement Enter;
	@FindBy(xpath="//input[@name='submit' and @value='Add']")
	WebElement Add;

	public SecondQuestion() {
		PageFactory.initElements(driver, this);

	}

	public void AddElemt()  {
		try {
			Enter.sendKeys("test110");
			Thread.sleep(2000);
			Add.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public boolean Removed() {

		try {
			driver.findElement(By.name("todo[9]"));
			return false;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return true;
		}

	}

	public void RemoveIt() {
		if (!G.isSelected())
			G.click();
		delete.click();

	}

}