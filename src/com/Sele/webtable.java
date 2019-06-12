package com.Sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/WebTable.html");
//cell
		String text = driver.findElement(By.xpath("//div[contains(text(),'ankita')]")).getText();
		System.out.println(text);
//table
		List<WebElement> fulltable = driver
				.findElements(By.xpath("//div[contains(@class,'ui-grid-viewport ng-iso')]"));
       for (WebElement webElement : fulltable) {
	     String a = webElement.getText();	
	     System.out.println(a);
	     System.out.println(fulltable.size());
//row
	     driver.findElement(By.xpath(""))
       
       
       }
	}

}
