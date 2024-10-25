package com.MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationForm {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testRegistrationForm() throws InterruptedException {
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");

		// Locate and fill out the registration form fields
		WebElement usernameField = driver.findElement(By.id("user_login"));
		WebElement emailField = driver.findElement(By.id("user_email"));
		WebElement passwordField = driver.findElement(By.id("user_pass"));
		WebElement confirmPasswordField = driver.findElement(By.id("user_confirm_password"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		// Input test data
		usernameField.sendKeys("testuser1232927");
		emailField.sendKeys("testuser241@example.com");
		passwordField.sendKeys("Password1234");
		confirmPasswordField.sendKeys("Password1234");

		// Submit the form
		submitButton.click();

		Thread.sleep(4000);
		
		String expectedMessage = "User successfully registered.";
		WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]"));
		Assert.assertEquals(successMessage.getText(), expectedMessage, "Registration message is not as expected.");
	}

	@AfterClass
	public void tearDown() {

		driver.quit();

	}

}
