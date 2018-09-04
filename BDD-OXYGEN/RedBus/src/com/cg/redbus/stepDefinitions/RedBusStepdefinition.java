package com.cg.redbus.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RedBusStepdefinition {
	
	private WebDriver driver;
	
	@Given("^user is given with redbus application on their desktop$")
	public void user_is_given_with_redbus_application_on_their_desktop() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.redbus.in/");
	}

	@When("^user enters valid source, destination, onward date and return date\\(optional\\)$")
	public void user_enters_valid_source_destination_onward_date_and_return_date_optional() throws Throwable {
		
		WebElement from=driver.findElement(By.id("src"));
		from.sendKeys("Hyderabad");
		Thread.sleep(2000);
		
		from =driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
		from.click();
		
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		Thread.sleep(2000);
		
		to= driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]"));
		to.click();
		
		WebElement date=driver.findElement(By.id("onward_cal"));
		date.sendKeys("21/08/2018");
		Thread.sleep(2000);
		
		date= driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]"));
		date.click();
	
		WebElement btn=driver.findElement(By.id("search_btn"));
		btn.click();
	}

	@Then("^display the page showing all the details of available buses on that particular day$")
	public void display_the_page_showing_all_the_details_of_available_buses_on_that_particular_day() throws Throwable {
		String actual=driver.getTitle();
		String expected="Search Bus Tickets";
		Assert.assertEquals(expected, actual);
		
		driver.close();
	}

}
