package day01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTotalImages {

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		List<WebElement> img =	driver.findElements(By.tagName("img"));
		
		System.out.println(img.size());
		
		driver.close();



	}

}
