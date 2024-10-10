package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\Admin\\Desktop\\Selenium.txt");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		WebElement MSG = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/ul/li/div[2]/h3/center"));
		Thread.sleep(1000);
		System.out.println(MSG.getText());
		driver.close();


	}

}
