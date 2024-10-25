package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D21Synchronization_ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//From City
		driver.findElement(By.id("src")).sendKeys("Kolh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
		
		//To City
		driver.findElement(By.id("dest")).sendKeys("Bang");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		
		//Date
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[7]/span/div[1]/span")).click();
		
		//Search bus
		driver.findElement(By.id("search_button")).click();
		
		//Result
		System.out.println(driver.findElement(By.xpath("//*[@id=\"8331995\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();
	}

}
