package staragile_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_link {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("Mobiles"));
		link.click();
		Thread.sleep(2000); // Sleep for 2 seconds
		driver.close();

	}
}
