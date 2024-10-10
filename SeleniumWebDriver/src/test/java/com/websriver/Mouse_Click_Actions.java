package com.websriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Click_Actions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		//WebElement Click = 	driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(Click).contextClick().perform();
		
		WebElement Dclick = 	driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.moveToElement(Dclick).doubleClick().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[2]/a")).click();
		
		
		
	/*	List<WebElement> Diplay =	driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li"));
		for(WebElement D :Diplay)
		{
			System.out.println(D.getText());
		}*/

	}

}
