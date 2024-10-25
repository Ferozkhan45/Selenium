package staragile_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select_Option 
{

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();

		String criteria = "Bahrain";

		for (WebElement option : options) {
			if (option.getText().contains(criteria)) {
				dropdown.selectByVisibleText(option.getText());
				break; 
			}
		}

		driver.quit();

	}
}