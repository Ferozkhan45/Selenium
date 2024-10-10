package com.youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_Name {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
		// Get Number of Links.

		driver.get("https://www.google.co.in/");
		List<WebElement> URL =	driver.findElements(By.tagName("a"));
		System.out.println(URL.size());
		
		// Get Number of Images.
		
/*		driver.get("https://www.google.co.in/");
		List<WebElement> image =	driver.findElements(By.tagName("img"));
		System.out.println(image.size());*/

	}

}
