package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testlogin()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("admin123");
		lp.clicLogin();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
