package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Myntra {
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="//input[@type='email']")
	private WebElement username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	public LoginPage_Myntra(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
}
