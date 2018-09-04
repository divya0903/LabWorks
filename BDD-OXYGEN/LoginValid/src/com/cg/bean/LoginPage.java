package com.cg.bean;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how=How.ID,id="username")
	private WebElement username;
	
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	
	@FindBy(how=How.ID,id="submit")
	private WebElement submit;
	
	@FindBy(how=How.XPATH,xpath="/html/body/center/h1")
	private WebElement actualValid;
	
	@FindBy(how=How.XPATH,xpath="/html/body/center/h1")
	private WebElement actualInvalid;
	
	public String getActualValid() {
		return actualValid.getText();
	}

	public String getActualInvalid() {
		return actualInvalid.getText();
	}

	public String getUsername() {
		return username.getAttribute("value");
	}
	
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	
	public String getPassword() {
		return password.getAttribute("value");
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public WebElement getSubmit() {
		return submit;
	}
	
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
	public void clickSignin()
	{
		submit.click();
	}
	
}
