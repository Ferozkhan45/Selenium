package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class OrangehHrmlLive_Login {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("ffds");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
		driver.findElement(By.xpath("/html/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		System.out.println(driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).getText());
		
		driver.close();
		

	}

}
