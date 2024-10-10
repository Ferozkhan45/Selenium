package com.TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void OpenGoogle() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		driver.get("https://www.google.co.in/");

		System.out.println("Title is : " + driver.getTitle());

		driver.close();

	}

	@Test
	public void openchrome() {

		System.out.println("Title is : ");

	}

}
