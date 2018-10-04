package com.qa.stepDefination;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.init();
	   
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		 loginpage = new LoginPage();
	String title=loginpage.validateLoginPageTitle();
	Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		homepage=loginpage.login(pro.getProperty("username"), pro.getProperty("password"));	
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String homepagetitle=homepage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homepagetitle);	 
	  
	   
}

}