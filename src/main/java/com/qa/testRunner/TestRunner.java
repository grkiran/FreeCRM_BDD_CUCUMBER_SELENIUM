package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:/Users/GRK/testhome/FreeCRMCucumberPOM/src/main/java/com/qa/featues/FreeCRM.feature",
			glue={"com/qa/stepDefination"},
			monochrome=true,
			dryRun=false)
	
	public class TestRunner{
		
	}

