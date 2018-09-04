package com.cg.project.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonSearchPage {

	@FindBy(how=How.ID,id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(how=How.CLASS_NAME,className="nav-input")
	private WebElement button;
	
	public String getSearch() {
		return search.getAttribute("value");
	}

	public void setSearch(String search) {
		this.search.sendKeys(search);
	}

	public WebElement getButton() {
		return button;
	}
	
	public void setButton(WebElement button) {
		this.button=button;
	}
	
	public void clickSearch()
	{
		button.submit();
	}
}
