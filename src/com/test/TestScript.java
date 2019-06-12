package com.test;

 
import com.Sele.BaseClass;
import org.openqa.selenium.WebDriver;
import com.pom.HomePage;
import com.pom.LoginPage;

public class TestScript extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = getBrowser("chrome");
		HomePage hp = new HomePage(driver);
		driver.get("https://www.amazon.in/");
		inputValuestoWebelement(hp.getSearchFeild(), "mobile");
		elementClick(hp.getSignInbtn());
		LoginPage log=new LoginPage(driver);
		inputValuestoWebelement(log.getLoginFeild(),"hasanumar");
		elementClick(log.getSubmitBtn());
		
		
		
		
	}
}
