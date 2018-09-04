package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.bean.RedbusSearchPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedbusWithBean {

	private WebDriver driver;
	private RedbusSearchPage searchPage;
	
	@Before
	public void setUpEnv()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	}

	@Given("^user is given with redbus application on their desktop$")
	public void user_is_given_with_redbus_application_on_their_desktop() throws Throwable {
		
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		searchPage = new RedbusSearchPage();
		PageFactory.initElements(driver, searchPage);
	}

	@When("^user enters valid source, destination, onward date and return date\\(optional\\)$")
	public void user_enters_valid_source_destination_onward_date_and_return_date_optional() throws Throwable {

		searchPage.setFrom("Hyderabad");
		Thread.sleep(2000);
		searchPage.clickFrom();

		searchPage.setTo("Bangalore");
		Thread.sleep(2000);
		searchPage.clickTo();

		searchPage.setDate("21-Aug-2018");
		Thread.sleep(2000);
		searchPage.clickOndate();

		searchPage.clickSearch();
	}

	@Then("^display the page showing all the details of available buses on that particular day$")
	public void display_the_page_showing_all_the_details_of_available_buses_on_that_particular_day() throws Throwable {
		String actual = driver.getTitle();
		String expected = "Search Bus Tickets";
		Assert.assertEquals(expected, actual);

		driver.close();
	}

}

