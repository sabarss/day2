package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static void webtable() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rocsa_000\\eclipse-workspace\\SeliniumModel4\\Driver\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		WebElement findElement = driver.findElement(By.xpath("//table//tbody//tr//td"));
		 //WebElement findElement2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//th[text()='Burj Khalifa']"));
		 //WebElement findElement2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//thead//tr//th[text()='City']"));
		 String text = findElement.getText();	
		 //System.out.println(text);
		//System.out.println(findElement.getText());
		/*for(int i=1;i<=4;i++)
		{
		if(text.equals("City"))
				{
			 //WebElement findElement = driver.findElement(By.xpath("//table//tbody//tr[1]//td["+i+"]"));//td[1] td[2]
			 WebElement findElement = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[2]"));
			 String text2 = findElement.getText();
			 System.out.println(text2);
				}*/
		 WebElement tab = driver.findElement(By.tagName("table"));
			List<WebElement> trow = driver.findElements(By.tagName("tr"));
			List<WebElement> tdata = driver.findElements(By.tagName("td"));
			
		 
		 for(int i=1;i<=trow.size();i++)
		 {
			 for(int j=1;j<tdata.size();j++)
			 {
			 WebElement all = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+j+"]"));
			 System.out.print(all.getText());
			 System.out.print(" ");
		 }
			 System.out.println(" ");
		 }
	
		          
		}
	

	public static void main(String[] args) {
		webtable();

	}

}
