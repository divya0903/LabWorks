package com.cg.project.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how=How.ID,id="login_field")
	private WebElement username;
	
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	
	@FindBy(className="btn")
	private WebElement button;
	
	//@FindBy(how=How.XPATH,xpath="//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")
	@FindBy(how=How.XPATH,xpath="//*[@id=\"dashboard\"]/div[1]/div/div[2]/ul/li/div/a/span[1]")
	private WebElement actualValid;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"js-flash-container\"]/div/div")
	private WebElement actualInvalid;

	public String getActualValid() {
		return actualValid.getText();
	}

	public String getActualInvalid() {
		return actualInvalid.getText();
	}

	
	public LoginPage() {}	
	
	
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

	public WebElement getButton() {
		return button;
	}
	
	public void setButton(WebElement button) {
		this.button=button;
	}
	
	public void clickSignin()
	{
		button.submit();
	}
}
