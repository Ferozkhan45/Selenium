package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataProviderDemo {
	WebDriver driver;
	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "vinod", "vinod123" },
			new Object[] { "selva", "selva123" },
			new Object[] { "admin", "admin123" },
		};
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
