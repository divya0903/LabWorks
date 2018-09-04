package com.cg.project.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginFeatureStepDefinition {

	private WebDriver driver;
	
	@Given("^user is in github login page$")
	public void user_is_in_github_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://github.com/login");
	}

	@When("^user gives valid username and password$")
	public void user_gives_valid_username_and_password() throws Throwable {
		 WebElement userElement= driver.findElement(By.id("login_field"));
		 userElement.sendKeys("divya0903");
		 WebElement pswElement= driver.findElement(By.id("password"));
		 pswElement.sendKeys("Vijaya@123");
		 
		 pswElement.submit();
	}


	@Then("^user should login to the account successfully$")
	public void user_should_login_to_the_account_successfully() throws Throwable {
		String actual=driver.findElement
				(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")).getText();
		String expected="divya0903";
		 Assert.assertEquals(expected, actual);
		   
		   driver.close();
		
	}
	
	@When("^user gives invalid login credentials$")
	public void user_gives_invalid_login_credentials() throws Throwable {
		WebElement userElement= driver.findElement(By.id("login_field"));
		 userElement.sendKeys("skdhfjsdbn");
		 WebElement pswElement= driver.findElement(By.id("password"));
		 pswElement.sendKeys("fdfdg");
		 
		 pswElement.submit();
	}

	@Then("^it gives an error message displaying invalid username and password$")
	public void it_gives_an_error_message_displaying_invalid_username_and_password() throws Throwable {
		String actual=driver.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div/div")).getText();
		String expected="Incorrect username or password.";
		 Assert.assertEquals(expected, actual);
		   
		   driver.close();
		
		
	}
}
