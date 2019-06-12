package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DD extends BaseClass {

	public static WebDriver driver;

	public static void drop() throws Exception

	{
		driver = getBrowser("chrome");

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 */

		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("greens");
		System.out.println(username.isDisplayed());
		System.out.println(username.isEnabled());

		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("hgdhdhd");
		System.out.println(pass.isDisplayed());
		System.out.println(pass.isEnabled());
		Thread.sleep(5000);

		/*
		 * WebElement login = driver.findElement(By.xpath("//input[@id='u_0_2']"));
		 * 
		 * System.out.println(login.isDisplayed());
		 * System.out.println(login.isEnabled()); login.click();
		 * 
		 * 
		 * // driver.navigate().to(
		 * "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110"
		 * ); driver.navigate().back();
		 * 
		 * 
		 * WebElement forget =
		 * driver.findElement(By.xpath("//a[contains(@href,'royal_blue_bar')]"));
		 * forget.click();
		 * 
		 * WebElement facebook =
		 * driver.findElement(By.xpath("//a[contains(@title,'Go to')]"));
		 * System.out.println(facebook.getText());
		 * System.out.println(facebook.isDisplayed());
		 * System.out.println(facebook.isEnabled());
		 * 
		 * WebElement facebookHelps =
		 * driver.findElement(By.xpath("//div[contains(text(),'Facebook helps')]"));
		 * System.out.println(facebookHelps.getText());
		 * System.out.println(facebookHelps.isDisplayed());
		 * System.out.println(facebookHelps.isEnabled());
		 * 
		 * WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
		 * firstname.sendKeys("sabarish"); System.out.println(firstname.isDisplayed());
		 * System.out.println(firstname.isEnabled());
		 * 
		 * WebElement lastname =
		 * driver.findElement(By.xpath("//input[@name='lastname']"));
		 * lastname.sendKeys("sab"); System.out.println(lastname.isDisplayed());
		 * System.out.println(lastname.isEnabled());
		 */

	}

	public static void main(String[] args) throws Exception {

		drop();
	}

}
