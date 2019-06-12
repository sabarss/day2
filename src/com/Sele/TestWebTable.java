package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestWebTable {

	public static void chrome(String row, String cell) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement data = driver.findElement(By.xpath("//table//tbody//tr["+row+"]//td["+cell+"]"));
		System.out.println(data.getText());
		
		List<WebElement> thead = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		for (WebElement x : thead) {
			if (x.getText().equals("")) {
				
			}
		}
		
		List<WebElement> tcolumn = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
		for (int i = 0; i < tcolumn.size(); i++) {
			if (tcolumn.get(i).getText().equals("")) {
				
				List<WebElement> tdata = driver.findElements(By.xpath("//table//tbody//tr//td["+i+"]"));
				System.out.println(tdata );

			}
		}
		
	}

	public static void main(String[] args) {
		chrome("3","3");
		// ie();
	}

}
