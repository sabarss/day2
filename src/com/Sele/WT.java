package com.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT {
	public static void chrome(String rowcell, String coloumncell) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		//whole data from table
		List<WebElement> findElements = driver.findElements(By.xpath("//table//tbody//tr//td"));
		int tablesize = findElements.size();//table size
		System.out.println(tablesize);
		for (WebElement table : findElements) {
			String tabletext = table.getText();
			System.out.println(tabletext);
			
		}
		//Head data
		List<WebElement> head = driver.findElements(By.xpath("//table//thead//tr//th"));
		int headsize = head.size();
		System.out.println(headsize);
		for (WebElement thead: head) {
			String thtext = thead.getText();
			System.out.println(thtext);
			
		}
		//Coloumn head data
		
		List<WebElement> coloumnhead = driver.findElements(By.xpath("//table//tbody//tr//th"));
		int coloumnheadsize = coloumnhead.size();
		System.out.println(coloumnheadsize);
		for (WebElement cthead: coloumnhead) {
			String cthtext = cthead.getText();
			System.out.println(cthtext);
			
		}
		//Rowwise data
		List<WebElement> rowwise = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
		int rowwisesize = rowwise.size();
		System.out.println(rowwisesize);
		for (WebElement trowdata : rowwise) {
			String trowtext = trowdata.getText();
			System.out.println(trowtext);
			
		}
		//Coloumnwise data
		List<WebElement> coloumnwise = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int coloumnwisesize = coloumnwise.size();
		System.out.println(coloumnwisesize);
		for (WebElement tcoloumndata : rowwise) {
			String tcoloumntext = tcoloumndata.getText();
			System.out.println(tcoloumntext);
		}
		//Particular data
		WebElement particularcell = driver.findElement(By.xpath("//table//tbody//tr[4]//td[3]"));
		String particularcelltext = particularcell.getText();
		System.out.println(particularcelltext);
		//Dynamic Web Table for particular data
		WebElement particulardynamic = driver.findElement(By.xpath("//table//tbody//tr["+rowcell+"]//td["+coloumncell+"]"));
		String particulardynamictext = particulardynamic.getText();
		System.out.println(particulardynamictext);
		//Dynamic Web Table for coloumnwise data
		List<WebElement> tcoloumn = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
		int tcoloumnsize = tcoloumn.size();
		System.out.println(tcoloumnsize);
		for (int i =0 ; i <tcoloumnsize ; i++) {
			String text = tcoloumn.get(i).getText();
			
			if(text.equals("Dubai")) {
				
				List<WebElement> tcoldata = driver.findElements(By.xpath("//table//tbody//tr//td["+(i+1)+"]"));
				for (WebElement tdata : tcoldata) {
					System.out.println(tdata.getText());
					
				}
					
				}}
		
			List<WebElement> rowwise1 = driver.findElements(By.xpath("//table//tbody//tr[1]//td[4]"));
			int rowwisesize1 = rowwise1.size();
			System.out.println(rowwisesize1);
			for (WebElement trowdata1 : rowwise1) {
				String trowtext1 = trowdata1.getText();
				System.out.println(trowtext1);
				
			
		
				
	//row wise
	
	List<WebElement> tbody1 = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
	int tbodysize1 = tbody1.size();
	System.out.println(tbodysize1);
	for (int j =0 ; j <tbodysize1 ; j++) {
		String text = tbody1.get(j).getText();
		
		if(text.equals("Saudi Arabia")) {
			
			List<WebElement> tcoldata1 = driver.findElements(By.xpath("//table//tbody//tr["+(j+1)+"]//td"));
			for (WebElement tdata : tcoldata1) {
				System.out.println(tdata.getText());
				
			}
		
				//driver.close();
			}
	}
	}
	}
	public static void w3schools()
	{
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	 List<WebElement> data = driver.findElements(By.xpath("//table//tbody//tr[2]//td"));
	 int size = data.size();
	
	for(int i=0;i<size;i++)
	{
		String text = data.get(i).getText();
		if(text.equals("Maria Anders"))
		{
			List<WebElement> findElements = driver.findElements(By.xpath("//table[1]//tbody//tr//td["+(i+1)+"]"));
			for (WebElement webElement : findElements) {
				System.out.println(webElement.getText());
				
			}
		}
		
		
	}
	
	
	
	
	
	}
	
	
	
			
		
		
	
	public static void main(String[] args) {
		//chrome("3","3") ;
		w3schools();
		

	}

}
