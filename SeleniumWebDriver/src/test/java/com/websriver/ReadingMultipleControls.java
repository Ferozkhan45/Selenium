package com.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingMultipleControls {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();


		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2fLogin");

		List<WebElement> Form =	driver.findElements(By.cssSelector("input[class=\"form-control\"]"));

		Form.get(0).sendKeys("ferozkhan");
		Form.get(1).sendKeys("asdfdsa");

	}

}
