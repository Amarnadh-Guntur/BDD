package org.com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.com.Utility.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
public BaseClass() {
	
	 try {
		 prop = new Properties();
	 
	 FileInputStream ip = new FileInputStream("F:\\selenium\\Selenium Scripts\\CRMTEST\\Application.Properties");
	 prop.load(ip);
	 
	 }catch (FileNotFoundException e) {
		 e.printStackTrace();
	 }catch (IOException e) {
		 e.printStackTrace();
	 }
}

public void initiaization() {
	String BrowserName =prop.getProperty("Browser");
	
	if(BrowserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel3\\chromedriver.exe");
		driver = new ChromeDriver();
					
	}else if(BrowserName.equals("FF")) {
		System.setProperty("webdriver.firefox.driver", "F:\\Sel3\\geckodriver.exe");
		driver = new ChromeDriver();
		  
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(CommonUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(CommonUtil.IMPLICITWAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));

		
}   
}
