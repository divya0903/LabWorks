package com.cg.project.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchFeatureStepDefinition {

	private WebDriver driver;
	
	@Given("^user is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	}

	@When("^user searches for 'Agile Methodology' term$")
	public void user_searches_for_Agile_Methodology_term() throws Throwable {
	    WebElement searchElement= driver.findElement(By.id("lst-ib"));
	    searchElement.sendKeys("Agile methodology");
	    searchElement.submit();
	}

	@Then("^all the pages linked with 'Agile Methodology' must be displayed$")
	public void all_the_pages_linked_with_Agile_Methodology_must_be_displayed() throws Throwable {
	   String actual=driver.getTitle();
	   String expected="Agile Methodology - Google Search";
	   Assert.assertEquals(expected, actual);
	   
	   driver.close();
	}
}
