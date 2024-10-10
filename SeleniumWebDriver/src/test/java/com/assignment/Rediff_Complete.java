package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Complete {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//Full name
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Feroz khan");
		//mail
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("feroz2927fdsa");
		Thread.sleep(1000);
		//validate
		driver.findElement(By.xpath("//input[@value=\"Check availability\"]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font/b")).getText());
		
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("12343");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("12343");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input")).sendKeys("khan@gmail.com");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).click();
		
		//ClickDay
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]/option[4]")).click();
		
		//city
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[28]/td/div/table/tbody/tr[1]/td[3]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select/option[6]")).click();
		
		
		
		driver.findElement(By.id("mobno")).sendKeys("9849808222");
		
		
	}

}
