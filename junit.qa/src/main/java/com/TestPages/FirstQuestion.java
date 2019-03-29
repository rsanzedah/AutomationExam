package com.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class FirstQuestion extends TestBase {

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

	public FirstQuestion() {
		PageFactory.initElements(driver, this);

	}
	
		


	public void VerifyToggle() {
		Toggle.click();

	}

	public boolean VerifyCheck() {
		return A.isSelected() && B.isSelected() && C.isSelected() && D.isSelected() && E.isSelected() && F.isSelected()
				&& G.isSelected();
	}

}