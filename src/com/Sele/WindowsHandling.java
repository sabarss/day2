package com.Sele;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void chrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String parentw = driver.getWindowHandle();
		WebElement img = driver.findElement(
				By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/I/41t42zvJQjL.__AC_SY200_.jpg']"));
		img.click();
		Thread.sleep(2000);
		Set<String> chilw = driver.getWindowHandles();
		for (String x : chilw) {
			if (!x.equals(parentw)) {
				driver.switchTo().window(x);
				Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='submit.buy-now']")).click();
			}
		}
		driver.switchTo().window(parentw);
		driver.findElement(
				By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/I/41EtmhOcCFL.__AC_SY200_.jpg']"))
				.click();
		
		}

	public static void main(String[] args) throws InterruptedException {
		 chrome();

	}

}
