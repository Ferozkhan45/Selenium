package com.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();


		WebElement dropdownlist = driver.findElement(By.xpath("//select[@id='country']"));

		Select Country = new Select(dropdownlist);

		System.out.println(Country.getFirstSelectedOption().getText());

		List<WebElement> CountryList =	Country.getOptions();
		System.out.println(CountryList.size());
		System.out.println(CountryList.get(0).getText());

		/*for(WebElement c:CountryList)
		{
			System.out.println(c.getText());
		}*/


		for (int i=0; i<CountryList.size(); i++)
		{
			System.out.println(i+"." +CountryList.get(i).getText());	 
		}

		Country.selectByVisibleText("Syria");
		System.out.println(Country.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
