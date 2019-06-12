package com.test;

import org.openqa.selenium.WebDriver;

import com.Sele.BaseClass;
import com.pom.Homepage_Myntra;
import com.pom.LoginPage_Myntra;

public class TestScriptMyntra extends BaseClass  {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=getBrowser("chrome");
		driver.get("https://www.myntra.com");
		Homepage_Myntra hm=new Homepage_Myntra(driver);
		
		
		//switchtoAlert("Allow","confirm");
		mouseHovertoElement(hm.getProfileMouseOver());
		clickUsingActions(hm.getLoginButtonClick());
		
		
		LoginPage_Myntra lg=new LoginPage_Myntra(driver);
		inputValuestoWebelement(lg.getUsername(),"sandeep");
		inputValuestoWebelement(lg.getPassword(),"hijack");
		
		
		
		
		
	
		
		
	}
	

}
