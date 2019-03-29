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

	public static Properties prop;
	public static WebDriver driver;

	public TestBase() { // creating constructor. Will communicate with properties file.
		prop = new Properties();

		try {
			FileInputStream fle = new FileInputStream(
					"C:\\Users\\sanze\\eclipse-workspace\\junit.qa\\src\\main\\java\\com\\Config\\config.properties");
			prop.load(fle);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void init() {
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "\\C:\\Driver\\chromedriver.exe\\");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "\\C:\\SeleniumWebDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // pageloadouttime coming from util class
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicitywait coming from util class

	}

	public static void initil() {
		init();
		driver.get(prop.getProperty("url1")); // getting URL from config. 100% Abstraction

	}

	public static void initim() {
		init();
		driver.get(prop.getProperty("url2")); // getting URL from config. 100% Abstraction

	}

}
