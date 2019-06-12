package com.test;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

public class JunitAutomation extends BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public static void beforeclass() throws Exception
	{
		
		driver = getBrowser("chrome");
		
	}
	

}
