package com.qa.pages;

//git comment
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class LoginPage extends TestBase	 {

	//Page Factory OR
	@FindBy(name="username")
	WebElement uname;

	@FindBy(name="password")
	WebElement pword;

	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpButton;

	@FindBy(xpath="//a[@class='navbar-brand']//img[@class='img-responsive']")
	WebElement logo;

	//initializing the page objects *********
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	//actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	
	}

	public boolean validateCRMImage(){
		return logo.isDisplayed();
	}


	public HomePage login(String user, String pass) throws InterruptedException{
	
		uname.sendKeys(user);
		pword.sendKeys(pass);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginButton);
		//loginButton.click();
		return new HomePage();
	}
}

















