package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input")).sendKeys("ankushvankore@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();

		//System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText());
		//String msg = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
		//System.out.println(msg);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText());

		driver.close();
	}

}
