package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	@FindBy(xpath ="//input[@type='email']")
	private WebElement loginFeild;

	@FindBys({ @FindBy(xpath = "//input[@type='submit']"), @FindBy(xpath = "//input[@value='GO']") })
	private WebElement submitBtn;

	@CacheLookup
	@FindAll(
	{@FindBy(xpath="//input[@type='submit']"),
					@FindBy(xpath="//input[@value='GO']")
					})
	private WebElement submit;

	public WebElement getLoginFeild() {
		return loginFeild;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
}
