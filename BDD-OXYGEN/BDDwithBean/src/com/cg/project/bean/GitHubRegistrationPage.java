package com.cg.project.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GitHubRegistrationPage {

	@FindBy(how=How.ID,id="user_login")
	private WebElement username;
	
	@FindBy(how=How.ID,id="user_email")
	private WebElement email;
	
	@FindBy(how=How.ID,id="user_password")
	private WebElement password;

	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup-form\"]/auto-check[1]/dl/dd[2]")
	private WebElement userInvalid;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup-form\"]/auto-check[2]/dl/dd[2]")
	private WebElement emailInvalid;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup-form\"]/dl/dd[2]")
	private WebElement pswdinvalid;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup-form\"]/dl/dd[2]")
	private WebElement pswdLess;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup_button\"]")
	private WebElement button;
	
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void create()
	{
		button.click();
	}

	public String getUserInvalid() {
		return userInvalid.getText();
	}

	public String getEmailInvalid() {
		return emailInvalid.getText();
	}

	public String getPswdinvalid() {
		return pswdinvalid.getText();
	}

	public String getPswdLess() {
		return pswdLess.getText();
	}
	
	
	
}
