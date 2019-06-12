package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Myntra {
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProfileMouseOver() {
		return profileMouseOver;
	}

	public WebElement getLoginButtonClick() {
		return LoginButtonClick;
	}

	@FindBy(xpath="//span[@class='myntraweb-header-sprite desktop-iconUser sprites-headerUser']")
	private WebElement profileMouseOver;
	@FindBy(xpath="//a[text()='log in']")
	
	private WebElement LoginButtonClick;
	
	public Homepage_Myntra(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);

	}



}
