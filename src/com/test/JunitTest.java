package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	
	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
