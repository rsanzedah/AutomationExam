package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class TestBase {
	public static Properties prop; //global and static variable for Properties
	public static WebDriver driver;

	
	public TestBase() { //creating constructor. Will communicate with properties file.
		prop= new Properties();
		
	try {
		FileInputStream fle=new FileInputStream("C:\\Users\\sanze\\eclipse-workspace\\TestNg\\src\\main\\java\\com\\Config\\Config.properties");
		prop.load(fle);
	} catch (FileNotFoundException e) {e.printStackTrace();} 
	catch (IOException e) {e.printStackTrace();}
	
	}
	
	public static void initil() {
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "\\C:\\SeleniumWebDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //pageloadouttime coming from util class
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicitywait coming from util class 
		driver.get(prop.getProperty("url")); //getting URL from config. 100% Abstraction

		
	}
	
	

}
