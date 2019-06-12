package com.Sele;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2_LoginPage {

	public static void chrome() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement signIn = driver.findElement(By.xpath("//div[@id='nav-tools']//span[@class='nav-line-2' and text()='Your Orders']"));
		// mouse interaction
		Actions ac = new Actions(driver);
		ac.moveToElement(signIn).build().perform();
		Thread.sleep(5000);

		WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		ac.click(signInBtn).build().perform();
		//signInBtn.click();
		
		
	//	ac.sendKeys(signInBtn, "test").build().perform();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		chrome();
	}
}
