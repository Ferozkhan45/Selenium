package com.insuranceproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile_silver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		driver.findElement(By.xpath("//div[@class='main-navigation']//a[@id='nav_automobile']")).click();
		
		//Enter vehicle Data
		WebElement dropdownlist =	driver.findElement(By.id("make"));
		Select Vehicle = new Select(dropdownlist);
		Vehicle.selectByValue("Audi");
		
		driver.findElement(By.id("engineperformance")).sendKeys("234");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("01/01/2000");
		new Select(driver.findElement(By.id("numberofseats"))).selectByValue("4");
		new Select(driver.findElement(By.id("fuel"))).selectByIndex(1);
		driver.findElement(By.name("List Price")).sendKeys("1000");
		driver.findElement(By.name("Annual Mileage")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		
		
		//Enter Insurance data
		driver.findElement(By.id("firstname")).sendKeys("Feroz");
		driver.findElement(By.id("lastname")).sendKeys("Khan");	
		driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("01/01/1992");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.id("zipcode")).sendKeys("533001");
		new Select(driver.findElement(By.id("country"))).selectByValue("India");
		new Select(driver.findElement(By.xpath("//select[@id='occupation']"))).selectByValue("Employee");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0, 3000);");
		driver.findElement(By.xpath("//label[normalize-space()='Speeding']//span[@class='ideal-check']")).click();
		driver.findElement(By.id("nextenterproductdata")).click();
		
		
		//Enter Product data
		driver.findElement(By.id("startdate")).sendKeys("01/01/2025");
		new Select(driver.findElement(By.xpath("//select[@id='insurancesum']"))).selectByValue("7000000");
		new Select(driver.findElement(By.xpath("//select[@id='meritrating']"))).selectByValue("Bonus 1");
		new Select(driver.findElement(By.xpath("//select[@id='damageinsurance']"))).selectByValue("Full Coverage");
		driver.findElement(By.xpath("//label[normalize-space()='Euro Protection']//span[@class='ideal-check']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='courtesycar']"))).selectByValue("Yes");
		driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
		
		
		//silver price
		String actprc , expprc = "190.00", expclaim ="No", acpclaim, actcover , expcover = "No", actdis , ExpDis = "No";
		
		actprc = driver.findElement(By.id("selectsilver_price")).getText();
		acpclaim = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > section:nth-child(4) > section:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(2)")).getText();
		actcover = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
		actdis = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
		
		if(expprc.equals(actprc))
		{
		System.out.println("Price mathicng");	
		}
		else {
			System.out.println("Price not mathicng");
		}
	
		if(expclaim.equals(acpclaim))
		{
		System.out.println("Claim mathicng");	
		}
		else {
			System.out.println("Claim not mathicng");
		}
		
		if(ExpDis.equals(actdis))
		{
		System.out.println("Discount mathicng");	
		}
		else {
			System.out.println("Discount not mathicng");
		}
		
		if(expcover.equals(actcover))
		{
		System.out.println("cover mathicng");	
		}
		else {
			System.out.println("cover not mathicng");
		}
		
		if(actprc.equals(expprc) && acpclaim.equals(expclaim) && actcover.equals(expcover)  &&  ExpDis.equals(actdis))
			
		{
			driver.findElement(By.xpath("//section[@id='pricePlans']//label[1]//span[1]")).click();
					
		}
		
		else
		{
		System.out.println("Not matching");	
		}
		
		driver.close();
		
	}
	
	
	
	
		
	

}
