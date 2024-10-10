package com.websriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


		driver.get("https://www.redbus.in/");


		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Kaki");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();

		//driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();


		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Bang");
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='sc-iwsKbI jTMXri cursorPointing']"))).click();
		//driver.findElement(By.xpath("//li[@class='sc-iwsKbI jTMXri cursorPointing']")).click();
		

		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[2]/span[1]")).click();

		driver.findElement(By.xpath("//button[@id='search_button']")).click();

		System.out.println(driver.findElement(By.xpath("//li[@id='22480835']//div[@class='column-two p-right-10 w-30 fl']//div[1]")).getText());
		driver.close();

	}

}
