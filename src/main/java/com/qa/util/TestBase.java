package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static  WebDriver driver;
	public static Properties pro;

	public TestBase(){
		try {
			pro =new Properties();
			FileInputStream ip =new FileInputStream("C:/Users/GRK/testhome/FreeCRMCucumberPOM/src/main/java/com/qa/config/config.properties");
			pro.load(ip);
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void init(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GRK\\testhome\\FreeCRMCucumberPOM\\src\\test\\resource\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIMOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT, TimeUnit.SECONDS);
		String url = pro.getProperty("url");
		driver.get(url);
		
	}  
}
