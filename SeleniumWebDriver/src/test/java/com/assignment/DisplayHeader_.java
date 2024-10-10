package com.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayHeader_ {

	public static void main(String[] args) throws InterruptedException {

		//	ChromeOptions op = new ChromeOptions();
		//op.addArguments("--disable-notifications");



		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


		driver.get("https://demoqa.com/webtables");

		/*List<WebElement> Display =	driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div"));

		for(WebElement D : Display)
		{
			System.out.println(D.getText());
		}*/

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, 1000);");

		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Feroz");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("khan");	
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ferozkhan@gmail.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("19");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("1300000");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Feroz");
		Thread.sleep(1000);
		//Wait for the search results to update
		
		WebElement	delete_button = driver.findElement(By.xpath("//*[@title=\"Delete\"]"));
		delete_button.click();
		//driver.switchTo().alert().accept();
		driver.close();


	}

}
