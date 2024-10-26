package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13CreatingFriendsData {
	String fPath = "D:\\StarAgile\\Demos\\SA2406006\\SeleniumAutomationProject\\ExcelFiles\\FriendsData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Ankush");
		
		cell = row.createCell(1);
		cell.setCellValue("Vankore");
		
		cell = row.createCell(2);
		cell.setCellValue("Pattankodoli");
		
		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Ravindra");
		
		cell = row.createCell(1);
		cell.setCellValue("Shinde");
		
		cell = row.createCell(2);
		cell.setCellValue("Pattankodoli");
		
		row = sheet.createRow(2);
		cell = row.createCell(0);
		cell.setCellValue("Sachin");
		
		cell = row.createCell(1);
		cell.setCellValue("Patil");
		
		cell = row.createCell(2);
		cell.setCellValue("Pattankodoli");
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Friends");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
