package TestCase;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.TestBase;
import TestPages.FrontPage;
import TestUtil.TestUtil;

public class TestCase extends TestBase{

	FrontPage fp;
	TestUtil tu;
	
	public TestCase () {
		super();
		
	}
	@BeforeMethod
	public void Setup() {
		Log.info("FrontPage"); 
		Initial();
		fp=new FrontPage();
		tu.captureScreenshot(driver, "FrontPageScreenShot");
		
	}
	@Test (priority=1)
	public void FirstTest() throws Exception {
		Log.info("firstTestPage");
		fp.Hover();
		boolean checksummerdress = fp.ValidateSummerDress();
		Assert.assertTrue(checksummerdress);		
		
		tu.captureScreenshot(driver, "summerdress");
		
	}
	@Test (priority=2)
	public void Click() throws Exception {
		Log.info("clickbox");
		tu.captureScreenshot(driver, "box selection");
	}
	
	@Test (priority=0)
	public void BuyDress() throws Exception {
		fp.Hover();
		fp.BuySummmerDress();
		fp.SizeMedium();
		fp.AddtoCart();
		boolean VAC = fp.VerifyCartWorks();
		Assert.assertTrue(VAC);
	}
	
	@AfterMethod
	public void Close() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	
	}
}