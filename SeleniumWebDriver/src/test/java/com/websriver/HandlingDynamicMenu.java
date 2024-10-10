package com.websriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicMenu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		List<WebElement> Menu =	driver.findElements(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li"));
	  
	for(WebElement M :Menu )
	{
		System.out.println(M.getText());
	}


	}

}
