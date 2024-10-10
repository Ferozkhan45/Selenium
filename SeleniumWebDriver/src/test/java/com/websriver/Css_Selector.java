package com.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys("ferozkhan1786@gmail.com");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("1234543");
		driver.findElement(By.cssSelector("button[id=\"loginbutton\"]")).click();
		WebElement err = driver.findElement(By.cssSelector("div[class=\"_9ay7\"]"));

		String display = 	err.getText();
		System.out.println(display);

		//System.out.println(driver.findElement(By.cssSelector("div[class=\"_9ay7\"]")).getText());





	}

}
