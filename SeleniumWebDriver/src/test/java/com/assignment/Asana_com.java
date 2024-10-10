package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asana_com {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://asana.com/");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/nav/div/div[2]/div/div[1]/a[2]/span[1]")).click();

	}

}
