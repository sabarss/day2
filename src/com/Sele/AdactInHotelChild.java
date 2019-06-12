package SeliniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactInHotelChild extends BassClassAdactInHotel  {
	//static WebDriver driver;
	//static WebElement element;
	public static void main(String[] args) throws Throwable {
		driver=getBrowser("chrome");
		getUrl("https://www.adactin.com/HotelApp/");
		inputText(driver.findElement(By.xpath("//*[@id=\"username\"]")),"jjggg");
		inputText(driver.findElement(By.xpath("//input[@id='password']")),"password");
		click(driver.findElement(By.id("login")));
		
		
	}

	

}
		
		

	


