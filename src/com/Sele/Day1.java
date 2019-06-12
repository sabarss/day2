package com.Sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day1 {

	public static void chrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver wa = new ChromeDriver();
		wa.get("https://www.instagram.com/?hl=en");
		wa.close();

	}

	public static void ie() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
		WebDriver woo = new InternetExplorerDriver();
		woo.get("https://www.google.co.in");

	}
	public static void browser() {
		WebDriver driver;
		String browser = null;
		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver.get("https://www.instagram.com/?hl=en");
		}	
		}
		
	public static void main(String[] args) {
		chrome();
		// ie();
	}

}
