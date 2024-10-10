package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor)driver;	

		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Mohammad Feroz khan");
		WebElement Search =	driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()", Search);





	}

}
