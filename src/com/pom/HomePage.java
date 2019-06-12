
package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//a[@role='button' and text()='Sign in securely']")
	private WebElement signInbtn;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchFeild;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitBtn;

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public WebElement getSearchFeild() {
		return searchFeild;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		

	}

}
