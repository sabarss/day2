package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void browser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://soundcloud.com/");
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.equals("https://soundcloud/"))
		{
			WebElement account = driver.findElement(By.xpath("(//div[contains(@class,'trend')])[2]"));
			System.out.println(account.getText());
		}
		else
		{
			System.out.println("not a sound cloud website");
		}
		
		
	}

	public static void main(String[] args) {
		
		browser();
	}

}
