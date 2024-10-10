package com.youtube;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Locators_ {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();

		//WebElement Forms = 	driver.findElement(By.cssSelector("button[data-bs-target='#collapseTwo']"));
		//Forms.click();
		//Forms.click();

		driver.findElement(By.cssSelector("a[href=\"register.php\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("Feroz");
		driver.findElement(By.cssSelector("button[data-bs-target='#collapseThree']")).click();		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"browser-windows.php\"]")));
		button.click();
		
		
		//driver.findElement(By.xpath("//a[normalize-space()='Browser Windows']")).click();

		/*driver.findElement(By.cssSelector("button=[type=\"button\"]")).click();
		driver.findElement(By.cssSelector("a[href='login.php']")).click();
		driver.findElement(By.id("email")).sendKeys("ferozkhan1786@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234543");

		List<WebElement> Image =driver.findElements(By.className("list-group-item"));
		System.out.println(Image.size());

		List<WebElement> url = driver.findElements(By.tagName("a"));
		System.out.println(url.size());*/




	}

}
