package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadingData {

	String fpath = "D:\\Source\\Feroz_SelinumDemo\\SeleniumWebDriver\\Friendname.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;



	@Test
	public void getdata() 
	{

		row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());


	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("First Sheet");

	}

	@AfterTest
	public void afterTest() throws IOException {
		
		wb.close();
		fis.close();
	}

}
