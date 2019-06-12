package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.Sele.BaseClass;

public class JunitLoginOut extends BaseClass{
	public static WebDriver driver;

	@BeforeClass
	public static void Beforcls() throws Exception {
		driver = getBrowser("chrome");
		driver.get("http://automationpractice.com/index.php");
	}

	
	

	@Before 
	  public void BeforeMethod() throws Exception {
	  elementClick(driver.findElement(By.xpath("//a[@class='login']")));
	  inputValuestoWebelement(driver.findElement(By.xpath("//input[@id='email']")),
	  "thenmozhi.babu7@gmail.com");
	  inputValuestoWebelement(driver.findElement(By.xpath("//input[@id='passwd']"))
	  , "honey"); elementClick(driver.findElement(By.xpath(
	  "//p[@class='submit']//button[@type='submit']"))); }
	
	  
	  @Test public void test1() throws Exception {
	  inputValuestoWebelement(driver.findElement(By.xpath(
	  "//form[@id='searchbox']//input[@type='text']")), "Dresses");
	  elementClick(driver.findElement(By.
	  xpath("//button[@class='btn btn-default button-search']")));
	  selectDDusingVisibleText(driver.findElement(By.xpath(
	  "//select[@id='selectProductSort']")),"Price: Lowest first");
	  mouseHovertoElement(driver.findElement(By.xpath(
	  "//div[@class='product-image-container']//img[@src='http://automationpractice.com/img/p/7/7-home_default.jpg']"
	  ))); elementClick(driver.findElement(By.xpath(
	  "//div[@class='button-container']//a[@data-id-product='2']")));
	  Thread.sleep(3000);
	  elementClick(driver.findElement(By.xpath("//a[@title='Proceed to checkout']")
	  )); Thread.sleep(3000); elementClick(driver.findElement(By.
	  xpath("//a[@class='button btn btn-default standard-checkout button-medium']")
	  ));
	  elementClick(driver.findElement(By.xpath("//button[@name='processAddress']"))
	  ); Thread.sleep(3000);
	  clickUsingActions(driver.findElement(By.xpath("//input[@type='checkbox']")));
	  Thread.sleep(3000);
	  elementClick(driver.findElement(By.xpath("//button[@name='processCarrier']"))
	  ); Thread.sleep(3000);
	  elementClick(driver.findElement(By.xpath("//a[@title='Pay by check.']")));
	  elementClick(driver.findElement(By.
	  xpath("//button[@class='button btn btn-default button-medium']")));
	  
	  }
	  
	  @Test public void test2() throws Exception {
	  mouseHovertoElement(driver.findElement(By.xpath("//a[@title='Women']")));
	  clickUsingActions(driver.findElement(By.
	  xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//a[@title='T-shirts']"
	  ))); Thread.sleep(3000); mouseHovertoElement(driver.findElement(By.
	  xpath("//div[@class='product-container']//img[@class='replace-2x img-responsive']"
	  ))); Thread.sleep(2000); clickUsingActions(driver.findElement(By.
	  xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")));
	  Thread.sleep(3000);
	  elementClick(driver.findElement(By.xpath("//a[@title='Proceed to checkout']")
	  )); Thread.sleep(3000); elementClick(driver.findElement(By.
	  xpath("//a[@class='button btn btn-default standard-checkout button-medium']")
	  ));
	  elementClick(driver.findElement(By.xpath("//button[@name='processAddress']"))
	  ); Thread.sleep(3000);
	  clickUsingActions(driver.findElement(By.xpath("//input[@type='checkbox']")));
	  Thread.sleep(3000);
	  elementClick(driver.findElement(By.xpath("//button[@name='processCarrier']"))
	  ); Thread.sleep(3000);
	  elementClick(driver.findElement(By.xpath("//a[@title='Pay by check.']")));
	  elementClick(driver.findElement(By.
	  xpath("//button[@class='button btn btn-default button-medium']"))); }
	 
      

	/*
	 * @Test public void test3() throws Exception {
	 * inputValuestoWebelement(driver.findElement(By.xpath(
	 * "//form[@id='searchbox']//input[@type='text']")), "Dresses");
	 * elementClick(driver.findElement(By.
	 * xpath("//button[@class='btn btn-default button-search']")));
	 * Thread.sleep(3000); clickUsingActions(driver.findElement(By.xpath(
	 * "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[2]/span"))); }}
	 * 
	 */
  
  @After public void Aftermethod() throws Exception {
  elementClick(driver.findElement(By.xpath("//a[@class='logout']"))); }
  
  
  
  
  
  
  @AfterClass public static void afterclass() {
  
  driver.quit();
  
  }}
 



