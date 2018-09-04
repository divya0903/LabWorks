package com.cg.project.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearchStepDefinition {

	private WebDriver driver;
	
	@Given("^user is given amazon application into their desktop where they search for mobile$")
	public void user_is_given_amazon_application_into_their_desktop_where_they_search_for_mobile() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
	}

	@When("^there is availability of mobile$")
	public void there_is_availability_of_mobile() throws Throwable {
		 WebElement searchElement= driver.findElement(By.id("twotabsearchtextbox"));
		 searchElement.sendKeys("redmi note 5");
		 searchElement.submit();
	}
	
	@Then("^display all the details of the product$")
	public void display_all_the_details_of_the_product() throws Throwable {
		 String actual=driver.getCurrentUrl();
		    String expected="https://www.amazon.in/s?url=search-alias%3Daps&field-keywords=redmi+note+5";
		    Assert.assertEquals(expected, actual);
			   
			   driver.close();
	}
	
	
	@When("^there is no availability of mobile$")
	public void there_is_no_availability_of_mobile() throws Throwable {
		 WebElement searchElement= driver.findElement(By.id("twotabsearchtextbox"));
		 searchElement.sendKeys("abababababab");
		 searchElement.submit();
	}

	@Then("^display not matches found$")
	public void display_not_matches_found() throws Throwable {
	
		String actual=driver.findElement(By.id("noResultsTitle")).getText();
		String expected="Your search \"abababababab\" did not match any products.";
	    Assert.assertEquals(expected, actual);
		   
		   driver.close();
	}

}
