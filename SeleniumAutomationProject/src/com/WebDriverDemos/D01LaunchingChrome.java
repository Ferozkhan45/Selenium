package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		//It will launch blank browsers
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		//driver.close();
	}

}
