package com.cg.project.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubRegistrationStepDefinition {

	private WebDriver driver;
	

	@Given("^user is on github sign up page$")
	public void user_is_on_github_sign_up_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://github.com/join");
	}
	@When("^user enters valid username, email and password$")
	public void user_enters_valid_username_email_and_password() throws Throwable {
		 WebElement userElement= driver.findElement(By.id("user_login"));
		 userElement.sendKeys("abcbhellooca1346");
		 WebElement emailElement= driver.findElement(By.id("user_email"));
		 emailElement.sendKeys("divyabca1346@gmail.com");
		 WebElement pswElement= driver.findElement(By.id("user_password"));
		 pswElement.sendKeys("sdfgdavdayuda12b");
		 
		 userElement.submit();
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
		 WebElement userElement= driver.findElement(By.id("user_login"));
		 userElement.sendKeys("a");
		 WebElement emailElement= driver.findElement(By.id("user_email"));
		 emailElement.sendKeys("abc1346@gmail.com");
		 WebElement pswElement= driver.findElement(By.id("user_password"));
		 pswElement.sendKeys("gdavdayuda12b");
		 
		 userElement.submit();
	}

	@Then("^Invalid UserName message should be displayed$")
	public void invalid_UserName_message_should_be_displayed() throws Throwable {
	   
	    String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/auto-check[1]/dl/dd[2]")).getText();
	    String expected="Login is already taken";
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	}

	@When("^user enters invalid email$")
	public void user_enters_invalid_email() throws Throwable {
		WebElement userElement= driver.findElement(By.id("user_login"));
		 userElement.sendKeys("abchello1346");
		 WebElement emailElement= driver.findElement(By.id("user_email"));
		 emailElement.sendKeys("abc1346.com");
		 WebElement pswElement= driver.findElement(By.id("user_password"));
		 pswElement.sendKeys("gdavdayuda12b");
		 
		 userElement.submit();
	}

	@Then("^Invalid email message should be displayed$")
	public void invalid_email_message_should_be_displayed() throws Throwable {
		
		String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/auto-check[2]/dl/dd[2]")).getText();
		    String expected="Email is invalid or already taken";
		    Assert.assertEquals(expected, actual);
		    
		    driver.close();
	}
	@When("^user enters passowrd less than (\\d+) characters$")
	public void user_enters_passowrd_less_than_characters(int arg1) throws Throwable {
		WebElement userElement= driver.findElement(By.id("user_login"));
		 userElement.sendKeys("abchello1346");
		 WebElement emailElement= driver.findElement(By.id("user_email"));
		 emailElement.sendKeys("abchello1346@gmail.com");
		 WebElement pswElement= driver.findElement(By.id("user_password"));
		 pswElement.sendKeys("gda12");
		 
		 userElement.submit();

	    
	}

	@Then("^Password should be greater than (\\d+) characters will be displayed$")
	public void password_should_be_greater_than_characters_will_be_displayed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/dl/dd[2]")).getText();
	    String expected="Password is too short (minimum is 7 characters)";
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	    
	}

	@Given("^user is on github signup page$")
	public void user_is_on_github_signup_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://github.com/join");
	    
	}
	
	@When("^user enters passowrd without numbers$")
	public void user_enters_passowrd_without_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userElement= driver.findElement(By.id("user_login"));
		 userElement.sendKeys("abchello1346");
		 WebElement emailElement= driver.findElement(By.id("user_email"));
		 emailElement.sendKeys("abc1346@gmail.com");
		 WebElement pswElement= driver.findElement(By.id("user_password"));
		 pswElement.sendKeys("gdavdahgf");
		 
		 userElement.submit();
	    
	}

	@Then("^Password needs atleast one number message will be displayed$")
	public void password_needs_atleast_one_number_message_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual=driver.findElement(By.xpath("//*[@id=\"signup-form\"]/dl/dd[2]")).getText();
	    String expected="Password needs at least one number";
	    Assert.assertEquals(expected, actual);
	    
	    driver.close();
	    
	}



		}

