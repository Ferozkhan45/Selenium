package com.assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");

		//List<WebElement> URL = 	driver.findElements(By.tagName("a"));
		//System.out.println("Number of Link :" +URL.size() );

		//List<WebElement> Image	= driver.findElements(By.tagName("img"));
		//System.out.println("Number of images : " + Image.size());



		//	WebElement samsung = driver.findElement(By.linkText("Samsung galaxy s6"));
		//samsung.click();

		driver.findElement(By.partialLinkText("Swiggy Corporate")).click();
		driver.findElement(By.partialLinkText("Corporate")).click();

	}

}
