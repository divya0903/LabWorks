package com.cg.naukri.stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriRegistration {

	private WebDriver driver;
	
	@Given("^user will be on home page of 'naukri\\.com'$")
	public void user_will_be_on_home_page_of_naukri_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.naukri.com/");
	}
	
	@When("^user clicks on 'register with us'$")
	public void user_clicks_on_register_with_us() throws Throwable {
		WebElement button=driver.findElement(By.xpath("//*[@id=\"p0widget\"]/div/div[1]/div/input"));
		   button.click();
	}

	@When("^selects iam a fresher$")
	public void selects_iam_a_fresher() throws Throwable {
	   WebElement button=driver.findElement(By.xpath("//*[@id=\"flowBifurcation\"]/div[2]/form/div[1]/div/button"));
	   button.click();
	}

	@Then("^user will be redirected to registration page for fresher$")
	public void user_will_be_redirected_to_registration_page_for_fresher() throws Throwable {
	    
		String actual=driver.getCurrentUrl();
	    String expected="https://my.naukri.com/account/register/basicdetails";
	    Assert.assertEquals(expected, actual);
	   
	}

	@When("^user enters valid basic details$")
	public void user_enters_valid_basic_details() throws Throwable {
	   WebElement name=driver.findElement(By.id("fname"));
	   name.sendKeys("abcd");
	   WebElement email=driver.findElement(By.id("email"));
	   email.sendKeys("sdfkjnsdjk@gmail.com");
	   WebElement pswd=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[3]/div[1]/div/input"));
	   		
	   pswd.sendKeys("abcdefgh");
	   WebElement mobile=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]"));
	   mobile.sendKeys("8111111111");
	   WebElement location=driver.findElement(By.name("city"));
	   location.sendKeys("Ahmedabad");
	   
	   name.submit();
	}

	@Then("^user should be registered successfully$")
	public void user_should_be_registered_successfully() throws Throwable {
	    
		String actual=driver.getCurrentUrl();
		String expected="https://my.naukri.com/account/register/education";
		Assert.assertEquals(expected, actual);
		
		driver.close();
	}
}
