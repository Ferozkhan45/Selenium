package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04ReadingMultipleControls {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		//List<WebElement>textBoxes = driver.findElements(By.cssSelector("input[class=\"form-control\"]"));
		List<WebElement>textBoxes = driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div/div/div/form/fieldset/div[2]/fieldset/input"));
		textBoxes.get(0).sendKeys("saroja");
		textBoxes.get(1).sendKeys("saroja123");
		
		driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
		
		System.out.println("Error Message: " + driver.findElement(By.xpath("//*[@id=\"lblMsg\"]")).getText());
		
		driver.close();
	}

}
