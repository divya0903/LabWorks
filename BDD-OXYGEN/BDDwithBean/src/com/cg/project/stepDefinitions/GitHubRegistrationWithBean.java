package com.cg.project.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.bean.GitHubRegistrationPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubRegistrationWithBean {

	private WebDriver driver;
	private GitHubRegistrationPage register;

	@Before
	public void setUpEnv()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	}
	
	@Given("^user is on github sign up page$")
	public void user_is_on_github_sign_up_page() throws Throwable {
		
		  driver = new ChromeDriver();
		  driver.get("https://github.com/join");
		  register = new GitHubRegistrationPage();
		  PageFactory.initElements(driver, register);
	}
	@When("^user enters valid username, email and password$")
	public void user_enters_valid_username_email_and_password() throws Throwable {
		
		register.setUsername("abcbhellooca1346");
		register.setEmail("divyabca1346@gmail.com");
		register.setPassword("sdfgdavdayuda12b");
		
		register.create();
	}

	@Then("^account should be created successfully for the user$")
	public void account_should_be_created_successfully_for_the_user() throws Throwable {
	    String actual=driver.getCurrentUrl();
	    String expected="https://github.com/join/plan";
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		 
		register.setUsername("a");
		register.setEmail("abc1346@gmail.com");
		register.setPassword("gdavdayuda12b");
		
		register.create();
	}

	@Then("^Invalid UserName message should be displayed$")
	public void invalid_UserName_message_should_be_displayed() throws Throwable {
	   
	    String expected="Login is already taken";
	    Assert.assertEquals(expected, register.getUserInvalid());
	    
	    driver.close();
	}

	@When("^user enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
		
		register.setUsername("qydbghsbdyuedgh");
		register.setEmail("abc1346com");
		register.setPassword("gdavdayuda12b");
		
		register.create();
		
	}

	@Then("^Invalid email message should be displayed$")
	public void invalid_email_message_should_be_displayed() throws Throwable {
		
		    String expected="Email is invalid or already taken";
		    Assert.assertEquals(expected, register.getEmailInvalid());
		    
		    driver.close();
	}
	@When("^user enters passowrd less than (\\d+) characters$")
	public void user_enters_passowrd_less_than_characters(int arg1) throws Throwable {
		
		register.setUsername("dawndoanasdhau");
		register.setEmail("qhydbashdb1346@gmail.com");
		register.setPassword("gd12b");
		
		register.create();
	    
	}

	@Then("^Password should be greater than (\\d+) characters will be displayed$")
	public void password_should_be_greater_than_characters_will_be_displayed(int arg1) throws Throwable {
		
	    String expected="Password is too short (minimum is 7 characters)";
	    Assert.assertEquals(expected, register.getPswdLess());
	    
	    driver.close();
	    
	}
	
	@When("^user enters passowrd without numbers$")
	public void user_enters_passowrd_without_numbers() throws Throwable {
	    
		register.setUsername("dawndoanasdhau");
		register.setEmail("qhydbashdb1346@gmail.com");
		register.setPassword("gdgdfyshdfauh");
		
		register.create();
	    
	}

	@Then("^Password needs atleast one number message will be displayed$")
	public void password_needs_atleast_one_number_message_will_be_displayed() throws Throwable {
	   
	    String expected="Password needs at least one number";
	    Assert.assertEquals(expected, register.getPswdinvalid());
	    
	    driver.close();
	    
	}
}

