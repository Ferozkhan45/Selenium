package com.assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Image_RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.findElement(By.xpath("//*[@id=\"nextenterinsurantdata\"]")).click();
		WebElement img =	driver.findElement(By.xpath("//button[@id='open']"));
		img.click();
		
		Robot Rb = new Robot();
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_TAB);
		
		for(int i = 0; i<7; i++)
		{
			Thread.sleep(1000);
			Rb.keyPress(KeyEvent.VK_TAB);
		}
		
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_DOWN);
		
		for(int i = 0; i<4; i++)
		{
			Thread.sleep(1000);
			Rb.keyPress(KeyEvent.VK_TAB);
		}
		
		
		
		Thread.sleep(1000);
		Rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
	
	

}
