package com.websriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleOf2ndTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		driver.findElement(By.xpath("//a[@title='Safe banking practices: RBI Kehta Hai']")).click();

		Set<String> Windows	=	driver.getWindowHandles();
		Iterator<String> itr =	Windows.iterator();
		String Win1 = itr.next();
		String Win2 = itr.next();

		
		driver.switchTo().window(Win2);
		System.out.println(driver.getTitle());


	}

}
