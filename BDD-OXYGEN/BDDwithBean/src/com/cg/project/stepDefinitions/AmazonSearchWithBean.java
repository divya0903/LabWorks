package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.bean.AmazonSearchPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSearchWithBean {

	private WebDriver driver;
	private AmazonSearchPage searchPage;
	
	@Before
	public void setUpEnv()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	}
	
	@Given("^user is given amazon application into their desktop where they search for mobile$")
	public void user_is_given_amazon_application_into_their_desktop_where_they_search_for_mobile() throws Throwable {
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  searchPage = new AmazonSearchPage();
		  PageFactory.initElements(driver, searchPage);
	}

	@When("^there is availability of mobile$")
	public void there_is_availability_of_mobile() throws Throwable {
		
		searchPage.setSearch("redmi note 5");
		searchPage.clickSearch();
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
		 
		 searchPage.setSearch("abababababab");
		 searchPage.clickSearch();
	}

	@Then("^display not matches found$")
	public void display_not_matches_found() throws Throwable {
	
		String actual=driver.findElement(By.id("noResultsTitle")).getText();
		String expected="Your search \"abababababab\" did not match any products.";
	    Assert.assertEquals(expected, actual);
		   
		   driver.close();
	}

}
