package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownComplete {
	
	public static void chrome() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");	
	WebElement day = driver.findElement(By.id("day"));
	Select sc =new Select(day);
	sc.selectByVisibleText("2");
	//sc.deselectByVisibleText("2");
	sc.selectByValue("15");
	String attribute = day.getAttribute("birthday_day");//att_name
	System.out.println(attribute);
	
	WebElement firstSelectedOption = sc.getFirstSelectedOption();
	firstSelectedOption.getText();
	System.out.println(firstSelectedOption.getText());
	
	List<WebElement> findElements1 = driver.findElements(By.id("day"));
	for (WebElement webElement : findElements1) {
		System.out.println(webElement.getText());
		
	}
	}

	public static void main(String[] args) {
   chrome();
	}

}
