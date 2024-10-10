package com.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox_Click {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		//1st Approach
		
		WebElement Search =	driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]"));
		Search.sendKeys("Automation jobs");
		Search.sendKeys(Keys.ENTER);


		//2nd Approcah

		//driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]")).sendKeys("Automation jobs");
		//driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]")).sendKeys(Keys.RETURN);



	}

}
