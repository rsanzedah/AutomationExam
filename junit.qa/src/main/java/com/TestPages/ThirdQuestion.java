package com.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class ThirdQuestion extends TestBase {

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

	public ThirdQuestion() {
		PageFactory.initElements(driver, this);

	}

	public void AddElemt() {
		try {
			for(int i=0;i<10;i++)
			{
				Enter.sendKeys("test" + String.valueOf(i));
				Thread.sleep(2000);
				Add.click();
				if(i == 0)
				{
					driver.navigate().refresh();
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public boolean Removed() {
		for(int i=1;i<10;i++)
		{
			String str = "todo[" + String.valueOf(i) + "]";
			System.out.println("Checking " + str + ", ...");
			try {
				driver.findElement(By.name(str));
				System.out.println("Found " + str + ", ...");
				return false;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Luckly didnt found " + str + ", ...");
			}
		}
		return true;
	}

	public void RemoveIt() {
		delete.click();
		driver.navigate().refresh();

	}
	
	public void VerifyToggle() {
		if (!Toggle.isSelected())
			Toggle.click();

	}

	public boolean VerifyCheck() {
		return A.isSelected() && B.isSelected() && C.isSelected() && D.isSelected() && E.isSelected() && F.isSelected()
				&& G.isSelected();
	}

}