package com.websriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dash_Bling {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();



		driver.get("https://dash.bling-center.com/platform/signIn.html");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//button[@class=\"forget-password-btn\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"email1\"]")).sendKeys("ferozkhan1786@gmail.com");
		driver.findElement(By.xpath("//button[@onclick=\"forgotPassword()\"]")).click();

		Thread.sleep(10000);
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"resetsuccess\"]"));
		System.out.println(msg.getText());

		driver.close();



	}

}
