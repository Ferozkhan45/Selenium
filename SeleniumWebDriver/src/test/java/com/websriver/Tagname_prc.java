package com.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_prc {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		List <WebElement>  URL=	driver.findElements(By.tagName("a"));
		//System.out.println("Total number of link :" + URL.size());
		

		for (int i = 0; i<=URL.size(); i++) 
		{
		System.out.println(URL.get(i).getText());	
		}
		
		driver.close();
		
	}

}
