package com.TestPages;

import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;
public class Tres extends TestBase {
			
	
	@FindBy(xpath="//select[@name='due_month']")
	WebElement month;
	
	public void Pickmonth() {
		month.click();
	}
	
	 // create hash set
	
	public void DropDown() {
    HashSet <String> newset = new HashSet <String>();

    // populate hash set
    newset.add("Jan"); 
    newset.add("Feb");
    newset.add("Mar");
    newset.add("Apr"); 
    newset.add("May");
    newset.add("Jun");  
    newset.add("Jul"); 
    newset.add("Aug");
    newset.add("Sep");  
    newset.add("Oct"); 
    newset.add("Nov");
    newset.add("Dec");  


    // check the existence of element
    boolean exist = newset.contains("Jan");
    boolean exist1 = newset.contains("Feb");
    boolean exist2= newset.contains("Mar");
    boolean exist3= newset.contains("Apr");
    boolean exist4= newset.contains("May");
    boolean exist5= newset.contains("Jun");
    boolean exist6 = newset.contains("Jul");
    boolean exist7 = newset.contains("Aug");
    boolean exist8 = newset.contains("Sep");
    boolean exist9 = newset.contains("Oct");
    boolean exist0 = newset.contains("Nov");
    boolean exist00 = newset.contains("Dec");
    

    System.out.println("Is the element exists: "+ exist);
	}
  public void Use() { 
		PageFactory.initElements(driver, this);


	}
}