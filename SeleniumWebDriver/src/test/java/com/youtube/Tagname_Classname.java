package com.youtube;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class Tagname_Classname {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();


		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();



		List<WebElement> Image =driver.findElements(By.className("lnXdpd"));
		System.out.println(Image.size());

		List<WebElement> url = driver.findElements(By.tagName("a"));
		System.out.println(url.size());


		for (int i = 0; i <url.size()-1; i++)
			System.out.println(url.get(i).getText());

		driver.close();






	}



}
