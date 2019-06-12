package com.Sele;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshand {
	public static WebDriver driver;
	
	public static void amazon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  String parent = driver.getWindowHandle();//parent or 0
		  WebElement enter = driver.findElement(By.id("twotabsearchtextbox"));
		  enter.sendKeys("redmi7");
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  driver.findElement(By.xpath("//span[text()='Redmi Note 4 (Black, 64GB)']")).click();
		  Set<String> child = driver.getWindowHandles();
		  for (String x : child) {
			  if(!parent.equals(x))
			  {
				  driver.switchTo().window(x);
				  Thread.sleep(5000);
				  driver.findElement(By.linkText("options")).click();
				  
				  
			  }
				  
			
		}}

	public static void main(String[] args) throws InterruptedException {
	amazon();

	}

}
