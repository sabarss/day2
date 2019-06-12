package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("http://demo.guru99.com/test/radio.html"); List<WebElement>
		 * checBox = driver.findElements(By.xpath("//input[@type='checkbox']")); for
		 * (WebElement x : checBox) { //if (x.getText().equals("UK")) { x.click(); //} }
		 */
		driver.get(
				"https://www.redbus.in/search?fromCityName=Chennai%20%28All%20Locations%29&fromCityId=123&toCityName=Madurai%20%28All%20Locations%29&toCityId=126&onward=12-May-2019&opId=0&busType=Any");
		Thread.sleep(3000);
		List<WebElement> checbox1 = driver.findElements(By.xpath("//ul[@class='dept-time dt-time-filter']//li"));
		for (WebElement depttime : checbox1) {
			String text = depttime.getText();
			if(text.equals("6 am to 12 pm (24)")) {
			
			depttime.click();
			System.out.println(depttime.getText());
			
		}}
	}
	

	public static void main(String[] args) throws InterruptedException {
		chrome();

	}

}
