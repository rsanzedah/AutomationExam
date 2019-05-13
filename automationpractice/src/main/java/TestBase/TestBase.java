package TestBase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import TestUtil.TestUtil;


public class TestBase{ 
public static Properties prop;
public static WebDriver driver;
public static final Logger Log = Logger.getLogger(TestBase.class.getName());
public static String localdirectory= System.getProperty("user.dir"); //used to dynamically find the path of the java project home
	
public TestBase() { //constructor
	prop = new Properties();
	
	try {
		FileInputStream File = new FileInputStream(localdirectory+"\\src\\main\\java\\Config\\Config.properties");
		prop.load(File); //loading all files from config
	} catch (FileNotFoundException e) { //if file not located, will throw exception
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) { //catches all exceptions
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String Log4JConfigFiles = localdirectory+"\\src\\main\\java\\Config\\log4j.properties"; //sourcing logging from Log4J properties file
	PropertyConfigurator.configure(Log4JConfigFiles); //initializing log
	
}
public static void Initial() {
	String Browser = prop.getProperty("browser");
	
	if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", localdirectory+"\\src\\main\\resources\\chromedriver.exe"); //sourcing from local directory within project
		driver = new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", localdirectory+"\\src\\main\\resources\\geckodriver.exe"); //sourcing from local directory within project
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadoutTime, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitLoadoutTime, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
				
}
/*
@BeforeTest
public static void Log() {
	String Log4JConfigFiles = System.getProperty("user.dir")+"\\src\\main\\java\\Config\\log4j.properties"; //sourcing logging from Log4J properties file
	PropertyConfigurator.configure(Log4JConfigFiles); //initializing log
}*/

}
