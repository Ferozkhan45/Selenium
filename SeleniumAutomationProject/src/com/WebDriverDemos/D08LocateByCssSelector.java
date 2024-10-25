package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.cssSelector("input[type='text']"));
		emailId.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][aria-label=\"Password\"]"));
		password.sendKeys("123456789");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		loginBtn.click();
		
		
	}

}
