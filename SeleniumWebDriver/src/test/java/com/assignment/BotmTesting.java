package com.assignment;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BotmTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));



		driver.get("https://www.botmtesting.com/a/p/free-trial");
		driver.findElement(By.xpath("//*[@id=\"trial_fname\"]")).sendKeys("Mohammad");
		driver.findElement(By.xpath("//*[@id=\"trial_lname\"]")).sendKeys("Feroz khan");
		driver.findElement(By.xpath("//*[@id=\"trial_company\"]")).sendKeys("Khan Auto Mobiles");
		driver.findElement(By.xpath("//*[@id=\"trial_email\"]")).sendKeys("khan@automobiles.com");
		jse.executeScript("window.scrollTo(0, 300);");
		
		

		WebElement dropdownlist = driver.findElement(By.xpath("//*[@id=\"select2-trial_country_code-8g-container\"]"));
	//	WebElement dropdownlist = driver.findElement(By.xpath("html/body/div/div/div/div/div[3]/div[2]/form/div[6]/div[3]/div[1]/span/span[1]/span/span[1]	"));
		dropdownlist.click();
		//Select Country = new Select(dropdownlist);
		


		



	//	driver.findElement(By.xpath("html/body/div/div/div/div/div[3]/div[2]/form/div[6]/div[3]/div/select")).click();
		//driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("ind"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"trial_mobile\"]")).sendKeys("9849808222");
		
		/*driver.findElement(By.xpath("/html/body/div/div/div/div/div[3]/div[2]/form/div[6]/div[3]/div[1]/span/span[1]/span/span[2]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[10]")).click();
		driver.findElement(By.xpath("//*[@id=\"trial_mobile\"]")).sendKeys("123465467");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/form[1]/div[7]/span[1]/span[1]/span[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"trial_mobile\"]")).sendKeys("123465467");
		driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[88]")).click();
		driver.close();*/

	
	
	}	
	
	
	

}
