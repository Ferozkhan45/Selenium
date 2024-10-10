package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login_DDF {
	String fpath = "D:\\Source\\Feroz_SelinumDemo\\SeleniumWebDriver\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileOutputStream fos;
	int index = 1;


	WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void f(String un, String ps) 
	{

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();


	}


	@AfterMethod
	public void afterMethod() {

		row = sheet.getRow(index);
		cell = row.getCell(2);
		
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Pass");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
			cell.setCellValue("Pass");
	}
		else
		{
			System.out.println("Loginfail");
			cell.setCellValue("Fail");
		}
		
		index++;
		
		
	}

	@DataProvider
	public Object[][] getLoginData() {
		int totalrows = sheet.getPhysicalNumberOfRows();

		String[][] Logindata = new String[totalrows-1][2];

		for (int i = 0; i < totalrows - 1; i++) {
			for (int j = 0; j < 2; j++) {
				Logindata[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return Logindata;
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Login Data");
		fos = new FileOutputStream(file);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");


	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		driver.close();
	}

}
