package com.Assignments;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A10OHRM_Login_Logout {
	WebDriver driver;
	@Test(priority = 1)
	public void login1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
	@Test(priority = 2)
	public void login2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("pradymna");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pradymna123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
	@Test(priority = 3)
	public void login3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("vivek");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vivek123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}
	@Test(priority = 4)
	public void login4() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@AfterMethod
	public void logout() {
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Login pass");
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
		{
			System.out.println("Login fail");
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
