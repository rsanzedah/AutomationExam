package TestUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import TestBase.TestBase;


public class TestUtil extends TestBase {
	public static long PageLoadoutTime = 20;
	public static long ImplicitLoadoutTime = 20;
	


public static void captureScreenshot(WebDriver driver, String Screenshot) {
TakesScreenshot TS = (TakesScreenshot) driver; //converted WebDriver into Screenshot
File Source = TS.getScreenshotAs(OutputType.FILE); //calls Screenshot to create image file
try {
	FileUtils.copyFile(Source, new File("./Screenshot/"+ Screenshot+ ".png")); //copies file to desired location, decides what format
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}	
}
