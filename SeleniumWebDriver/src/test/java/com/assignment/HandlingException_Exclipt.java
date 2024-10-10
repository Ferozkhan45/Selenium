package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingException_Exclipt {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

		driver.get("https://demoqa.com/alerts");

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div[2]/button"))).click();

		



	}

}
