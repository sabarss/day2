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
import org.openqa.selenium.support.ui.Select;

public class Autoprat {
	
	
	public static void Autos() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php/");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("qazwsx@gmail.com");
		
		WebElement conts = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		conts.click();
		Thread.sleep(2000);
	
		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		first.sendKeys("sabarish");
		Thread.sleep(2000);
		
		WebElement last = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		last.sendKeys("sundar");
		Thread.sleep(3000);
		
		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
		email1.clear();
		email1.sendKeys("qazwsx@gmail.com");
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys("1248867");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("days"));
		Select dd = new Select(day);
	    dd.selectByValue("20");
	    Thread.sleep(2000);
	    
		WebElement months = driver.findElement(By.id("months"));
		Select mm = new Select(months);
	    mm.selectByIndex(5);
	    Thread.sleep(2000);
	    
	    
	    WebElement years = driver.findElement(By.id("years"));
		Select yy = new Select(years);
	    yy.selectByValue("1999");
	    Thread.sleep(2000);
		
	    
	    WebElement fn = driver.findElement(By.xpath("//input[@id='firstname']"));
		fn.sendKeys("The");
		Thread.sleep(2000);
		
		WebElement ln = driver.findElement(By.xpath("//input[@id='lastname']"));
		ln.sendKeys("GOAT");
		Thread.sleep(3000);
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("karcher");
		Thread.sleep(3000);
		
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
		address1.sendKeys("wall street");
		Thread.sleep(3000);
		
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("seabrees");
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Miami");
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		state.sendKeys("Florida");
		Thread.sleep(3000);
		
		
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='postcode']"));
		zipcode.sendKeys("33101");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		country.sendKeys("United states");
		Thread.sleep(3000);
		
		WebElement addinfo = driver.findElement(By.xpath("//textarea[@id='other']"));
		addinfo.sendKeys("9000000200");
		Thread.sleep(3000);
		
		WebElement homephone = driver.findElement(By.xpath("//input[@id='phone']"));
		homephone.sendKeys("48297516");
		Thread.sleep(3000);
		
		WebElement mobphone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobphone.sendKeys("9876543210");
		Thread.sleep(3000);
		
		WebElement assign = driver.findElement(By.xpath("//input[@id='alias']"));
		assign.sendKeys("My address");
		Thread.sleep(3000);
	    
		/*File fileLocation = new File("C:\Users\Vignesh\eclipse-workspace\Selenium\Library\\ss1.png");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, fileLocation);*/
		
		WebElement Register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		Register.click();
		
		File fileLocation = new File("C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Library\\ss1.png");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, fileLocation);


	}

	public static void main(String[] args) throws InterruptedException, IOException {
	Autos();
	}

}
