package com.assignment;


	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	public class OrangeHRMTest {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        try {
	            driver.manage().window().maximize();
	            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            // Login
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")))
	                .sendKeys("Admin");
	            driver.findElement(By.name("password")).sendKeys("admin123");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();

	            // Logout
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")))
	                .click();
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//a[normalize-space()='Logout']"))).click();

	            // Take screenshot
	            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileHandler.copy(screenshot, new File("D:\\SS\\image.jpeg"));
	            System.out.println("Screenshot taken");

	        } catch (IOException e) {
	            System.err.println("Error taking screenshot: " + e.getMessage());
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}

	
	

