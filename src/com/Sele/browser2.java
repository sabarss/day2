package com.Sele;

import java.util.List;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverInfo;

public class browser2 {
	public static WebDriver driver;

	public static void getBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	}

	public static void getWebTable(String value) {

		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> trow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trow.size(); i++) {
			List<WebElement> thead = trow.get(i).findElements(By.tagName("th"));
			//System.out.println(trow.get(i).getText());
			for (int j = 0; j < thead.size(); j++) {
				String text = thead.get(j).getText();
				if (text.equals(value)) { 
					List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
					for (int k = 0; k < tdata.size(); k++) {
						String text2 = tdata.get(k).getText();
						System.out.println(text2);
					}
				}
			}
		}
	}

	
	
	
	public static void element(String value) {
	 WebElement tab = driver.findElement(By.tagName("table"));
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i <trow.size(); i++) {
			List<WebElement> tdata = driver.findElements(By.tagName("th"));
			for (int j = 0; j < tdata.size(); j++) {
				String text = tdata.get(j).getText();
				System.out.println(text);
			}
			
		}
		
		
	}
	public static void main(String[] args) throws Throwable {
		getBrowser("chROme");
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(2000);
		/*
		 * WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		 * email.sendKeys("sabrish.s.007@gmail.com");
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		 * password.sendKeys("123435435");
		 * 
		 * WebElement login =
		 * driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		 * login.click();
		 */
		getWebTable("Clock Tower Hotel");

	}
}
