package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void chrome(String row, String cell) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement mDD = driver.findElement(By.id("multi-select"));
		Select sc = new Select(mDD);
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);
		if (multiple) {
			sc.selectByIndex(1);
			sc.selectByVisibleText("New Jersey");
			sc.selectByValue("Texas");
			List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
			for (WebElement x : allSelectedOptions) {
				System.out.println(x.getText());
			}
			Thread.sleep(5000);
			sc.deselectByIndex(1);
			sc.deselectAll();
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		chrome("3","3");
		// ie();
	}

}
