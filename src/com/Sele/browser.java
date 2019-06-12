package com.Sele;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class browser {

	
	
		public static WebDriver driver;
		static String browser;
		public static void getBrowser(String browserName) {
			
		
	
		Switch(browserName){
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver=new chromeDriver();
			driver.manage().window().maximize();
			break;
			
			
		Case "firefox":
		
			System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
			driver=new firefoxDriver();
			driver.manage().window().maximize();
			break;
			
		case "ie":
			
			System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\SMART\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
			
			default:
				System.out.println("select any three browser");
		}
		public static void main(String[] args) {
		getBrowser(chrome);
		driver.get("http://www.facebook.com");
				
			
			
			
		
		
		
		
		}

	}


