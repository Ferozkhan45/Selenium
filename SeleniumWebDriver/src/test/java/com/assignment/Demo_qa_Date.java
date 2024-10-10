package com.assignment;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_qa_Date {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		driver.get("https://demoqa.com/automation-practice-form/");
		js.executeScript("window.scrollTo(0, 650);");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).sendKeys("29 Oct 1992" +Keys.ENTER);

		
		/*driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByIndex(10);
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).click();
		new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByValue("1992");
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, November 29th, 1992']")).click();*/
		
		driver.close();

	}

}
