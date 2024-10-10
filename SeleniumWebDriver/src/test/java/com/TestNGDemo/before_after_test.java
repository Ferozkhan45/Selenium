package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class before_after_test {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}

	@Test(priority = 1)
	public void testgoogle()

	{

		driver.get("https://www.google.co.in/");

	}

	@Test(priority = -1)
	public void testajio()

	{

		driver.get("https://www.ajio.com/");

	}

	@Test(priority = 2)
	public void testmeesho()

	{

		driver.get("https://www.meesho.com/");

	}

	@Test(priority = 3)
	public void amazon() {

		driver.get("https://www.amazon.in/");

	}

	@AfterTest
	public void afterTest() {
		
		driver.close();
	}
	
	@BeforeMethod
	public void beforeMethod() {
	
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		System.out.println("\tTitle is : " +driver.getTitle());
		System.out.println("After Method");
	}
	
		
	}
	
	
	

