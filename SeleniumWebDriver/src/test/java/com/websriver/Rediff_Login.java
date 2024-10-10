package com.websriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Login {
	WebDriver driver;

	public static void main(String[] args) 
	{

		Rediff_Login R	= new Rediff_Login();
		R.configuration();
		R.Opensite();
		R.SetuserName("Feroz");
		//R.signin();
		//R.displayErr();
		//R.close();
}
	public void configuration() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


	}

	public void Opensite() 
	{

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	}

	public void SetuserName(String un)
	{
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(un);
	}

	public void signin()
	{
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	}
	public void displayErr()
	{
		Alert	alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

	}
	public void close() {
		driver.close();
	}

}
