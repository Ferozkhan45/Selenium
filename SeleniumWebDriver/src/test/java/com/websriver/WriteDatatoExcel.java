package com.websriver;

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

public class WriteDatatoExcel {
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

	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("My first Excel File.xlsx");
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
