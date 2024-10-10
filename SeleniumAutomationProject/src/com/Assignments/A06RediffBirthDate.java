package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A06RediffBirthDate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		/*WebElement bDay = driver.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select day = new Select(bDay);
		day.selectByVisibleText("29");
		
		System.out.println(day.getFirstSelectedOption());
		*/
		
		new Select(driver.findElement(By.xpath("html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"))).selectByVisibleText("29");
	}

}