package com.TestNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyWordDrivemFrameWork {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;



	@Test
	public void Login() 
	{

		
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("Feroz");
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("1234");
		driver.findElement(By.xpath(prop.getProperty("Loginsubmit"))).click();
		System.out.println(driver.findElement(By.xpath("//span[@id='lblMsg']")).getText());
	}
	
	
	
	
	
	
	
	@BeforeTest
	public void beforeTest() throws IOException 
	{
		file = new File("D:\\Source\\Feroz_SelinumDemo\\SeleniumWebDriver\\src\\test\\java\\com\\TestNGDemo\\MyData.properties");
		fis = new FileInputStream (file);
		prop = new Properties();
		prop.load(fis); 	//Load all files from propriety file
		
		System.out.println(prop.getProperty("url"));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get(prop.getProperty("url"));

	}

	@AfterTest
	public void afterTest() {
	}

}
