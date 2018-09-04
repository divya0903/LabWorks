package com.cg.project.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.bean.GoogleSearchPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleWithBean {

	private WebDriver driver;
	private GoogleSearchPage searchPage;

	@Before
	public void setUpEnv() {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	}

	@Given("^user is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		searchPage = new GoogleSearchPage();
		PageFactory.initElements(driver, searchPage);

	}

	@When("^user searches for 'Agile Methodology' term$")
	public void user_searches_for_Agile_Methodology_term() throws Throwable {

		searchPage.setSearch("Agile Methodology");
		searchPage.clickSearch();
	}

	@Then("^all the pages linked with 'Agile Methodology' must be displayed$")
	public void all_the_pages_linked_with_Agile_Methodology_must_be_displayed() throws Throwable {
		String actual = driver.getTitle();
		String expected = "Agile Methodology - Google Search";
		Assert.assertEquals(expected, actual);

		driver.close();
	}
}


