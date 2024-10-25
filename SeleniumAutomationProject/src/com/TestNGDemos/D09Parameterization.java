package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class D09Parameterization {
	WebDriver driver;
	@Parameters({"userName", "password"})
	@Test
	public void loginToPracticeTestLogin(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	@Parameters({"userName1", "password1"})
	@Test
	public void loginToPracticeTestLogin1(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.partialLinkText("Log")).click();
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
