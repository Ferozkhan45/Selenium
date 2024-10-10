package com.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IPL_CG {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2024");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		WebElement Table =	 driver.findElement(By.className("points-table"));
		List <WebElement>	Rows = Table.findElements(By.tagName("tr"));

		


	}

}
