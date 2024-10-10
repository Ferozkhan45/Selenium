package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider_Demo {


	String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", acturl;
	WebDriver driver;

	@Test(dataProvider = "LoginData")
	public void logintohrm(String un, String ps) 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		acturl = driver.getCurrentUrl();
		//Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		//Assert.assertEquals(acturl, expurl, "Invalid Credinitials");
		Assert.assertTrue(driver.getPageSource().contains("Dashboard"));

	}

	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
	public void close()
	{
		driver.close();
	}




	@DataProvider
	public Object[][] LoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "Feroz", "Feroz123" },
			new Object[] { "Sana", "Sana123" },
			new Object[] { "admin", "admin123" },
		};



	}
}
