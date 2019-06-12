package com.Sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class Day2 {

	public static void chrome() throws Throwable  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		 WebElement userName = driver.findElement(By.id("identifierId"));
		userName.sendKeys("abdul.sadh");
		Thread.sleep(2000);
		WebElement Next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		Next.click();
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("hihi");
		}

	
	
	public static void main(String[] args)throws Throwable  {
		chrome();

	}
}
