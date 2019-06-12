package com.Sele;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rocsa_000\\eclipse-workspace\\SeliniumModel4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/WebTable.html");
		// particular cell
		String text = driver.findElement(By.xpath("//div[contains(text(),'Samidha')]")).getText();
		System.out.println(text);
		// full table
		/*List<WebElement> main = driver
				.findElements(By.xpath("//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]"));
		for (WebElement webElement : main) {
			String s = webElement.getText();
			System.out.println(s);
			System.out.println(main.size());
		}*/
		// particular data given by user
		String text2 = driver
				.findElement(
						By.xpath("//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]/div/div[1]/div/div[2]"))
				.getText();

		System.out.println(text2);
		//row wise full selection depends upon given 
		List<WebElement> Trow = driver.findElements(
				By.xpath("//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]/div/div[1]/div/div"));
		//System.out.println(Trow.size());

	/*	for (int i = 1; i <= Trow.size(); i++) {
			 WebElement trowData = driver.findElement(By.xpath(
					"//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]/div/div[1]/div/div[" + i + "]"));
			
			 String s=trowData.getText();
			 System.out.println(s);
		}*/
			 //Column wise 
			 
			 List<WebElement> tColumn = driver.findElements(
						By.xpath("//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]/div/div/div/div[4]"));
				/*System.out.println(tColumn.size());
				
				for (int j = 1; j <= tColumn.size(); j++) {
					 WebElement tColumnData = driver.findElement(By.xpath(
							 "//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]/div/div["+j+"]/div/div[3]"));
					
					 String s1=tColumnData.getText();
					 System.out.println(s1);
					 */
					 //WebElement part = driver.findElement(By.xpath("//*[@id=\"1557133031565-uiGrid-0006-header-text\"]"));
					 //String pa3 = part.getText();
					 
				
				for(int k=1;k<=tColumn.size();k++)
				{
					for(int m=1;m<=Trow.size();m++)
					{
						
						WebElement common = driver.findElement(By.xpath(
								 "//div[contains(@class,'ui-grid-viewport ng-isolate-scope')]/div/div["+k+"]/div/div["+m+"]"));	
						System.out.print(common.getText());
						System.out.print(" ");
						
					}
					System.out.println(" ");
					
					
				}
			 
			

		}
				

		}
	




