package day01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDemoCart {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		List<WebElement> link	= driver.findElements(By.className("list-inline-item"));
		
		System.out.println(link.size());
		
		for(WebElement x:link)
		{
			System.out.println(x.getText());
		}
		
		
		driver.close();

	}

}
