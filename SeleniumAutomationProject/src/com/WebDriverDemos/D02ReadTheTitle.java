package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02ReadTheTitle {

	public static void main(String[] args) {
		String expTitle = "Google", actTitle;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		actTitle = driver.getTitle();
		System.out.println("Title of this page: " + actTitle);
		
		if(expTitle.equals(actTitle))
			System.out.println("Opened Google\nTest case pass");
		else
			System.out.println("Not opened Google\nTest case fail");
		
		driver.close();
	}

}
