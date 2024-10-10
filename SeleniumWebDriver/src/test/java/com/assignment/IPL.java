package com.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPL {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.iplt20.com/points-table/men/2024");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
	List<WebElement> Team =	driver.findElements(By.xpath("//h2[contains( @class, 'ih-pt-cont')]"));
	
	for(WebElement T:Team)
	{
		System.out.println(T.getText());
	}
		
	
	List<WebElement> Row =	driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr"));
	System.out.println("Totoal rows " +Row.size() );
	
	System.out.println(Row.get(9).getText());
	
	driver.close();

	}

}