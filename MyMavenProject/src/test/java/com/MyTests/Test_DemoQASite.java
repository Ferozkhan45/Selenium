package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_DemoQASite {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		driver.get("https://demoqa.com/automation-practice-form/");
		jse.executeScript("window.scrollTo(0, 650)");

		WebElement Sports = driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-1\"]"));
		jse.executeScript("arguments[0].click()", Sports);

		// driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();

	}

}
