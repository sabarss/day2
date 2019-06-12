package org.automation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FirstDay {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(10000);
		Set<String> cid = driver.getWindowHandles();
		System.out.println(cid);
		WebElement btn1 = driver.findElement(By.id("button1"));
		btn1.click();

		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		Set<String> pid = driver.getWindowHandles();
		List<String> li = new ArrayList<>();
		li.addAll(pid);
		System.out.println(pid);

	}
}