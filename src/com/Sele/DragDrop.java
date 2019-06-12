
package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragDrop {

	public static void chrome(String row, String cell) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement price = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement credit = driver.findElement(By.id("credit2"));
		WebElement priceDrop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement creditDrop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		Actions ac = new Actions(driver);
		ac.dragAndDrop(price, priceDrop).build().perform();;
		ac.dragAndDrop(credit, creditDrop).build().perform();;
		
		//ac.dragAndDropBy(driver.findElement(By.name("range")), 50, 0).build().perform();
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		chrome("3","3");
		// ie();
	}

}
