package com.Sele;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Windowhandling {
	public static void drop() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		WebElement frame = driver.findElement(By.name("iframe2"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
	/*	String cid = driver.getWindowHandle();

		WebElement btn1 = driver.findElement(By.id("button1"));
		WebElement bt2 = driver.findElement(By.xpath("//button[text()='New Message Window']"));
		bt2.click();
		btn1.click();
		
		Set<String> pid = driver.getWindowHandles();
		//index
		List<String> li = new ArrayList<>();
		li.addAll(pid);
		String wi = li.get(2);
		driver.switchTo().window(wi);
		String title = driver.getTitle();
		System.out.println(title);
		//title
		for (String x : pid) {
			driver.switchTo().window(x);
			String title = driver.getTitle();
			if (title.contains("Free QA")) {
				driver.switchTo().window(x);
				driver.manage().window().maximize();
			}
		}
*/
		/*
		 * WebElement day = driver.findElement(By.id("day")); //select date by index
		 * Select dd=new Select(day); //dd.selectByIndex(25); dd.selectByValue("25");
		 * 
		 * WebElement months = driver.findElement(By.id("month")); //select by month
		 * Select mm=new Select(months); //mm.selectByValue("5");
		 * mm.selectByVisibleText("Feb"); WebElement firstSelectedOption =
		 * mm.getFirstSelectedOption();
		 * System.out.println(firstSelectedOption.getText());
		 */

		/*
		 * File filelocation= new
		 * File("C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Library\\t.png");
		 * TakesScreenshot ts= (TakesScreenshot)driver; File screenshotAs =
		 * ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(screenshotAs,
		 * filelocation);
		 * 
		 */
		/*
		 * WebElement years = driver.findElement(By.id("year")); //select by year Select
		 * yy=new Select(years); //yy.selectByValue("2015"); yy.selectByIndex(8);
		 */

	}

	public static void main(String[] args) throws IOException, InterruptedException {

		drop();
	}

}
