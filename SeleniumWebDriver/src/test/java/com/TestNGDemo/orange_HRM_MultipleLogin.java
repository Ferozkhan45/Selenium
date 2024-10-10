package com.TestNGDemo;

import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class orange_HRM_MultipleLogin {
	WebDriver driver;


	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test (priority = 1)
	public void login() 

	{

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();


	}


	@Test(priority = 2)
	public void login1() 

	{

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Feroz123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();


	}


	@AfterMethod
	public void Logout() 
	{

		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Login Pass");	
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		}

		else
		{
			System.out.println("Login Fail");	
		}


	}



	@AfterTest
	public void afterTest() 
	{
		driver.close();

	}

}
