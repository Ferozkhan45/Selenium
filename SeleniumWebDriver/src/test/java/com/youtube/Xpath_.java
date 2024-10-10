package com.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.id("email")).sendKeys("args");
		
		
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input[1]")).sendKeys("ferozkhan1786@gmail.com");
		
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ferozkhan1786@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("123432");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		String text = driver.findElement(By.xpath("//div[text()='Invalid username or password']")).getText();
		
	System.out.println(text);

		

		
	}

}
