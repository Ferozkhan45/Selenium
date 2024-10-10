package com.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Selected_Enabled_Display {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();

		WebElement Milk =	driver.findElement(By.cssSelector("input[value=\"Milk\"]"));
		
		
		
		
		if(Milk.isSelected()==false)
		{
			Milk.click();
			System.out.println("Dislay Status Milk : " +Milk.isDisplayed());
			System.out.println("Enabled Status Milk: " +Milk.isEnabled());
			System.out.println("Selected Status Milk: " +Milk.isSelected());
		}

		WebElement Butter =	driver.findElement(By.cssSelector("input[value=\"Butter\"]"));
		
		if (Butter.isSelected()==false) 
		{
			Butter.click();
			System.out.println("Dislay Status Butter : " +Butter.isDisplayed());
			System.out.println("Enabled Status Butter : " +Butter.isEnabled());
			System.out.println("Selected Status Butter : " +Butter.isSelected());
			
		}
		

		WebElement Cheese = driver.findElement(By.xpath("//input[@value=\"Cheese\"]"));
		
		if(Cheese.isSelected()==false)
		{
			Cheese.click();
			System.out.println("Dislay Status Cheese : " +Cheese.isDisplayed());
			System.out.println("Enabled Status Cheese : " +Cheese.isEnabled());
			System.out.println("elected Status Cheese : " +Cheese.isSelected());

		}



	}

}
