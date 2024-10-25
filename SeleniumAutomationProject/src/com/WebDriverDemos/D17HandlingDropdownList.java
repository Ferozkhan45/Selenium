package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D17HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement dropdownList = driver.findElement(By.id("country"));
		Select countries = new Select(dropdownList);
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		//List is just for display purpose. you cannot perform any operations on this
		//If you want to perform any operation on Dropdown list then use object of Select class
		//if you want to perform any operation on List then use object of List
		
		System.out.println("Total Countries: " + countryList.size());
		//System.out.println("First country: " + countryList.get(0).getText());
		
		/*for(WebElement c : countryList)
		{
			System.out.println(c.getText());
		}*/
		for(int i = 0; i < countryList.size(); i++)
		{
			System.out.println(i + ". " + countryList.get(i).getText());
		}
		
		//countries.selectByVisibleText("Canada");
		//countries.selectByValue("37");
		countries.selectByIndex(35);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
	}

}
