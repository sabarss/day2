package com.Sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APpage {
	
	
	public static void Auto() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("abcdes@gmail.com");
		WebElement createAccount = driver.findElement(By.xpath("//button[@id='SubmitCreate']/span"));
		createAccount.click();
		Thread.sleep(5000);
		
		
		WebElement mr = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		mr.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("sabarish");
		Thread.sleep(5000);
		
		 WebElement last = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		last.sendKeys("sundar");
		Thread.sleep(5000);
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.clear();
		mail.sendKeys("abcdes@gmail.com");
		Thread.sleep(5000);
		
		WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		passwd.sendKeys("12345678");
		
		
		/*File filelocation= new File("C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Library\\t3.png");
	//interface
		TakesScreenshot ts= (TakesScreenshot)driver;
	     File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(screenshotAs, filelocation);
	     */
	     
	
	}

	public static void main(String[] args) throws InterruptedException, IOException {
	Auto();
	}

}
