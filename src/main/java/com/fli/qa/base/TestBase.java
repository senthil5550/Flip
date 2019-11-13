package com.fli.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fli.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			
				prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\ssundaram\\eclipse-workspace\\SelSessions\\src\\main\\java\\com\\fli\\qa\\config\\config.properties");
			prop.load(ip);
			}
		catch(FileNotFoundException e){
			e.printStackTrace();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssundaram\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			//driver.manage().deleteAllCookies();
			//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.MILLISECONDS);
			//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.MILLISECONDS);
			driver.get(prop.getProperty("url"));
			
			}
	}

}
