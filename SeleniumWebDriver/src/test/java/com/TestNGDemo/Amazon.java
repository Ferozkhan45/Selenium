package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Amazon {

	WebDriver driver;

	@BeforeMethod
	public void OpenChrome()
	{
		{
			driver.get("https://www.amazon.in/");
			System.out.println("\tBefore");
			System.out.println("\t\tThe Title is" +driver.getTitle());
		}	
	}

	@Test (priority = 1)
	public void sell() 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Sell']")).click();
	}

	@Test(priority = 2)
	public void bestseller() 
	{

		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();

	}
	@Test(priority = 3)
	public void mobiles () 
	{

		driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();

	}
	@Test(priority = 4)
	public void Electronics() 
	{
		driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).click();
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("\tafter");
		System.out.println("\t\tThe Title is" +driver.getTitle());
}


	@BeforeTest
	public void beforeTest() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));	
	}


	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}
