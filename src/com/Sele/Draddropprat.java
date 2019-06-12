package com.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draddropprat {

	public static void chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));//5000
		
		WebElement bANK = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));//bank
		WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));//5000
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));//sales
	    
		
		WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement amount1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement acc1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement amm1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Thread.sleep(2000);
	    
	    
	    Actions ac= new Actions(driver);
	    ac.dragAndDrop(bANK, account).build().perform();
	    ac.dragAndDrop(amount, amount1).build().perform();
	    ac.dragAndDrop(sales, acc1).build().perform();
	    ac.dragAndDrop(amt, amm1).build().perform();
	}
	    
	    
	    
	   
public static void main(String[] args) throws InterruptedException  {
	chrome();
}
}
