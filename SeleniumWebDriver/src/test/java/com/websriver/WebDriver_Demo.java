package com.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Demo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		String st =	driver.getTitle();
		driver.manage().window().maximize();

		WebElement Login = 	driver.findElement(By.id("email"));
		Login.sendKeys("ferozkhan1786@gmail.com");

		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys("1234542");

		WebElement LgnBttn = driver.findElement(By.name("login"));
		LgnBttn.click();

		WebElement Err = driver.findElement(By.className("_9ay7"));
		String Text = Err.getText();

		System.out.println(Text);


		System.out.println(st);
		driver.close();


	}

}
