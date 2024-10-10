package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2fLogin");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("feroz");
		//driver.findElement(By.cssSelector(".email")).sendKeys("feroz");
		
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Username\"]")).sendKeys("@mail");
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Password\"]")).sendKeys("sdfds");


	}

}
