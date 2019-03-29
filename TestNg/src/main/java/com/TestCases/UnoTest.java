package com.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.TestPages.Dos;
import com.TestPages.Tres;
import com.TestPages.Uno;

public class UnoTest extends TestBase {

	Uno uno;
	Tres tres;
	Dos dos;

	public UnoTest() {
		super();

	}

	@BeforeMethod
	public void SetUp() {

		initil(); // launches browser, deletes cookies, etc. (gets ready)
		uno = new Uno();
		

	}

	@Test(priority = 0)
	public void runit() {

		uno.Enter("category");

		uno.ClickRegister();
		uno.yes();

	}

	public void hi() {

		tres.Pickmonth();
		tres.DropDown();

	}

	public void nope() {
		dos.Anotherpage();
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}