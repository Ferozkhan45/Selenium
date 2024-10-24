package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A07EchoechoCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement>products = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		
		/*WebElement milk = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + milk.isSelected());
		System.out.println("Visible : " + milk.isDisplayed());
		System.out.println("Enabled : " + milk.isEnabled());
		
		//if (checkBox.isSelected() == false) {
		if(!milk.isSelected()) {
			milk.click();
		}
		
		System.out.println("\nAfter...");
		System.out.println("Selected: " + milk.isSelected());
		System.out.println("Visible : " + milk.isDisplayed());
		System.out.println("Enabled : " + milk.isEnabled());
		*/
		
		for(WebElement pr : products)
		{
			System.out.println("Before...");
			System.out.println(pr.getAttribute("value") + " Selected: " + pr.isSelected());
			System.out.println(pr.getAttribute("value") + " Visible : " + pr.isDisplayed());
			System.out.println(pr.getAttribute("value") + " Enabled : " + pr.isEnabled());
			
			//if (checkBox.isSelected() == false) {
			if(!pr.isSelected()) {
				pr.click();
			}
			
			System.out.println("\nAfter...");
			System.out.println(pr.getAttribute("value") + " Selected: " + pr.isSelected());
			System.out.println(pr.getAttribute("value") + " Visible : " + pr.isDisplayed());
			System.out.println(pr.getAttribute("value") + " Enabled : " + pr.isEnabled());
			System.out.println("-------------------------------------");
		}
		
		driver.close();
		
		/*int[] nos = {1,2,3,4,5,6,7};
		for(int i = 0; i < nos.length; i++)
			System.out.println(nos[i]);
		
		for(int n : nos)
			System.out.println(n);*/
	}

}
