package com.stepdefenation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01GoogleTitle{

	WebDriver driver;
	String title;


	@Given("Open google")
	public void open_google() {

		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
	}

	@When("Read the title")
	public void read_the_title() {
		title = driver.getTitle();
		
	}

	@Then("Title should be google")
	public void title_should_be_google() {
		if(title.equals("Google"))
		{
			System.out.println("Title is mathcing");
		}
		else
		{
			System.out.println("Title not matching");
		}
		
		driver.close();
	}



}
