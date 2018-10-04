package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement userNameLable;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newcontact;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasks;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public Boolean verifyUserName() {
		return userNameLable.isDisplayed();
	}
	
	public void clickOnNewContactLink(){
		Actions actions =new Actions(driver);
		actions.moveToElement(contacts).build().perform();
		newcontact.click();
		
	}

}
 