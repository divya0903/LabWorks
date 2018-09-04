package com.cg.project.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RedbusSearchPage {

	@FindBy(how=How.ID,id="src")
	private WebElement from;
	
	@FindBy(how=How.ID,id="dest")
	private WebElement to;
	
	@FindBy(how=How.ID,id="onward_cal")
	private WebElement date;
	
	@FindBy(how=How.ID,id="search_btn")
	private WebElement button;

	@FindBy(how=How.XPATH,xpath="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	private WebElement fromXp;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	private WebElement toXp;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")
	private WebElement dateXp;

	public void setFrom(String from) {
		this.from.sendKeys(from);
	}

	public void setTo(String to) {
		this.to.sendKeys(to);
	}
	
	public void setDate(String date) {
		this.date.sendKeys(date);
	}

	public WebElement getButton() {
		return button;
	}

	public void setButton(WebElement button) {
		this.button = button;
	}
	
	public void clickSearch()
	{
		button.click();
	}
	
	public void clickFrom()
	{
		fromXp.click();
	}
	public void clickTo()
	{
		toXp.click();
	}
	public void clickOndate()
	{
		dateXp.click();
	}
}
