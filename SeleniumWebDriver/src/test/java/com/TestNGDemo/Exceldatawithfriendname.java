package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class Exceldatawithfriendname {
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

		cell.setCellValue("Feroz");

		cell = row.createCell(1);
		cell.setCellValue("khan");
		
		cell = row.createCell(2);
		cell.setCellValue("md");

		row = sheet.createRow(1);
		cell = row.createCell(0);

		cell.setCellValue("Raheem");

		cell = row.createCell(1);
		cell.setCellValue("SK");
		
		cell = row.createCell(2);
		cell.setCellValue("shauk");

	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("Friendname.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("First Sheet");

	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		System.out.println("Data added in the file");
		wb.close();
		fos.close();

	}

}
