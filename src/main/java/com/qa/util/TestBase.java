package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static WebDriver driver ;
    public static Properties prop;
    
	
     //define default constructor
	public TestBase(){
		 try{
			FileInputStream ip = new FileInputStream("C:\\Users\\nikpatil\\workspace\\CucumberWithPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(ip);
			}
		    catch (Exception e) {
			e.printStackTrace();
            } 
         }
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("firefox")){
			String geckoDriverPath = "C:\\Users\\nikpatil\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe";
            System.setProperty("webdriver.firefox.marionette", geckoDriverPath);
            WebDriver driver = new FirefoxDriver();
		
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}


}
