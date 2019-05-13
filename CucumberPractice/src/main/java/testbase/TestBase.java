package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static String localdirectory = System.getProperty("user.dir");
	
	public TestBase() {
		prop=new Properties();
		
		try {
			FileInputStream fileinput=new FileInputStream(localdirectory+"\\src\\main\\java\\config\\config.properties");
			prop.load(fileinput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initil() {
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", localdirectory+"\\src\\main\\resources\\chromedriver.exe");
	        driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", localdirectory+"\\src\\main\\resources\\geckodriver.exe");
	        driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", localdirectory+"\\src\\main\\resources\\iedriver.exe");
	        driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //pageloadouttime coming from util class
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicitywait coming from util class	
		driver.get(prop.getProperty("url")); //getting URL from config. 100% Abstraction	
	}
	
	
}
