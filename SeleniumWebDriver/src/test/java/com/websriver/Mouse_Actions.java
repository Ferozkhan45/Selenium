package com.websriver;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Mouse_Actions {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.get("https://www.istqb.in/");
		Actions act = new Actions(driver);

		WebElement SPC = driver.findElement(By.xpath("//li[contains(@class,'sp-menu-item sp-has-child')]//a[normalize-space()='SPECIALIST']"));
		act.moveToElement(SPC).perform();  /// Mouse Hover

		List<WebElement> SM = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li"));
		for (WebElement S : SM) {
			System.out.println(S.getText());
		}


		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Screenshot, new File("D:\\SS\\JQUERYSS.jpeg"));
		

	}

}
