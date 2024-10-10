package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTest {

	@Test(priority = 1)
	public void testgoogle()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.google.co.in/");
		driver.close();
	}

	@Test(priority = -1)
	public void testajio()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.ajio.com/");
		driver.close();
	}

	@Test(priority = 2)
	public void testmeesho()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.meesho.com/");
		driver.close();

	}

	@Test(priority = 3)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
