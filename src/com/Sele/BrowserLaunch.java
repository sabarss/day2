package com.Sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch extends BaseClass {

	static WebDriver driver;

	public static void launch() throws InterruptedException, IOException {
		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exee");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*
		 * File fileloc = new File(
		 * "D:\\Study Material\\Selenium Workspace\\E-Commerce\\Library\\h.png");
		 * TakesScreenshot ts = (TakesScreenshot) driver; File screenshot =
		 * ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(screenshot, fileloc);
		 */
	}

	public static void main(String[] args) throws Throwable {
		// launch();
		/*
		 * UserAccount.signIn(driver); //UserAccount.createAccount(driver);
		 * //UserAccount.personalInfo(driver); //UserAccount.address(driver);
		 * Login.acclogin(driver); Login.purchase(driver); Login.signout(driver);
		 */
		driver = getBrowser("chrome");
		/*getUrl("https://www.facebook.com");
		inputValuestoWebElement(driver.findElement(By.id("email")), "Test");
		inputValuestoWebElement(driver.findElement(By.id("pass")), "Pass");
		clickOnWebelement(driver.findElement(By.xpath("//input[@value='Log In']")));
		clickOnWebelement(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		
		*/
		getUrl("http://demo.automationtesting.in/Alerts.html");
		clickOnWebelement(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]")));
		clickOnWebelement(driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")));
		Alert simple= driver.switchTo().alert();
		Thread.sleep(2000);
        
		simple.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		clickOnWebelement(driver.findElement(By.xpath("//a[@class='analystic' and text()='Alert with OK & Cancel ']")));
		clickOnWebelement(driver.findElement(By.xpath("//button[@class='btn btn-success navbar-toggle']")));
		Alert confirm=driver.switchTo().alert();
		
		Thread.sleep(2000);
		confirm.dismiss();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
			
				
		
		
	}
}
