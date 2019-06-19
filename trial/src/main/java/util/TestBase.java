package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public static Properties prop;
	public static WebDriver driver;

	public static String localdirectory= System.getProperty("user.dir"); //used to dynamically find the path of the java project home
		
	public TestBase() { //constructor
		prop = new Properties();
		
		try {
			FileInputStream File = new FileInputStream(localdirectory+"\\src\\main\\java\\config\\config.properties");
			prop.load(File); //loading all files from config
		} catch (FileNotFoundException e) { //if file not located, will throw exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { //catches all exceptions
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void Initial() {
		String Browser = prop.getProperty("browser"); 
		
	
		
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", localdirectory+"\\src\\main\\java\\resources\\chromedriver.exe"); //sourcing from local directory within project
		driver = new ChromeDriver();
			 
		}
		else if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", localdirectory+"\\src\\main\\resources\\geckodriver.exe");//sourcing from local directory within project
			driver = new FirefoxDriver();
			  
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utils.PageLoadoutTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utils.ImplicitLoadoutTime, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}
}