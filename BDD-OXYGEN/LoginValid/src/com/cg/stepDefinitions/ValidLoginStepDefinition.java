package com.cg.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.bean.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLoginStepDefinition {

	private WebDriver driver;
	private LoginPage loginPage;
	
	@Before
	public void setUpEnv()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	}
	
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
		driver = new ChromeDriver();  
		driver.get("D:/BDD-html/login.html");
		loginPage = new LoginPage();
		PageFactory.initElements(driver, loginPage); 
	}

	@When("^user does not enter username$")
	public void user_does_not_enter_username() throws Throwable {
		loginPage.setUsername("");
		Thread.sleep(1000);
		loginPage.setPassword("admin");
		Thread.sleep(1000);
		loginPage.clickSignin();
	}

	@Then("^please enter username message should be displayed$")
	public void please_enter_username_message_should_be_displayed() throws Throwable {
		String expected="Please enter username";
		TargetLocator locator=driver.switchTo();
		Alert alert=locator.alert();
		String actual=alert.getText();
		 Assert.assertEquals(expected, actual);
		   
		   driver.close();
	}

	@When("^user does not enter password$")
	public void user_does_not_enter_password() throws Throwable {
		loginPage.setUsername("admin");
		Thread.sleep(1000);
		loginPage.setPassword("");
		Thread.sleep(1000);
		loginPage.clickSignin();
	}

	@Then("^please enter password message should be displayed$")
	public void please_enter_password_message_should_be_displayed() throws Throwable {
		String expected="Please enter password";
		String actual=driver.switchTo().alert().getText();
		 Assert.assertEquals(expected, actual);
		   
		   driver.close();
	}
	
	@When("^user gives valid username and password$")
	public void user_gives_valid_username_and_password() throws Throwable {
		loginPage.setUsername("admin");
		Thread.sleep(1000);
		loginPage.setPassword("admin");
		Thread.sleep(1000);
		loginPage.clickSignin();
	}

	@Then("^user should login to the account successfully$")
	public void user_should_login_to_the_account_successfully() throws Throwable {
		String expected="Login Successful";
		 Assert.assertEquals(expected, loginPage.getActualValid());
		   
		   driver.close();
	}

	@When("^user gives invalid login credentials$")
	public void user_gives_invalid_login_credentials() throws Throwable {
		loginPage.setUsername("asdgahs");
		Thread.sleep(1000);
		loginPage.setPassword("asagdy");
		Thread.sleep(1000);
		loginPage.clickSignin();
	}

	@Then("^it gives an error message displaying invalid username and password$")
	public void it_gives_an_error_message_displaying_invalid_username_and_password() throws Throwable {
		String expected="Login Fail";
		 Assert.assertEquals(expected, loginPage.getActualInvalid());
		   
		   driver.close();
	}
}
