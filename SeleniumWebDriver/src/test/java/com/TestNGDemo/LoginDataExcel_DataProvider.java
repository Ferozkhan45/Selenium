package com.TestNGDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataExcel_DataProvider {
	String fpath = "LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;

	@Test(dataProvider = "getlogindata")

	public void writedata(String un, String ps, String rs) {

	/*	row = sheet.createRow(index);
		cell = row.createCell(0);
		cell.setCellValue(un);

		cell = row.createCell(1);
		cell.setCellValue(ps);

		cell = row.createCell(2);
		cell.setCellValue(rs);*/
		
		
		sheet.createRow(index).createCell(0).setCellValue(un);
		sheet.getRow(index).createCell(1).setCellValue(ps);
		sheet.getRow(index).createCell(2).setCellValue(rs);
		

		index++;

	}

	@DataProvider
	public Object[][] getlogindata() {
		return new Object[][] {

				new Object[] { "Username", "Password", "Result" }, 
				new Object[] { "Feroz", "Feroz123", "Norun" },
				new Object[] { "john", "john123", "Norun" }, 
				new Object[] { "ram", "ram123", "Norun" },
				new Object[] { "kiran", "kiran123", "Norun" }, 
				new Object[] { "ravi", "ravi123", "Norun" },
				new Object[] { "mahes", "mahes13", "Norun" } };
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Login Data");

	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();

	}
}
