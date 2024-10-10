package com.TestNGDemo;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//Read the data from excel
// Pass this data to testcase
// update the result as pass or fail.

public class LogintoHRM_DDF {

	String fpath = "LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test(dataProvider = "getLoginData")
	public void LogintoHRM(String un, String ps, String rs) {
		System.out.println(un + ps + rs);
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] getLoginData() {
		int totalRows = sheet.getPhysicalNumberOfRows();
		String[][] loginData = new String[totalRows][3];

		for (int i = 0; i < totalRows; i++) {
			for (int j = 0; j < 3; j++) {
				loginData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return loginData;

	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fpath);
		fis = new FileInputStream(file);
		workbook  = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("LoginData");

	}

	@AfterTest
	public void afterTest() throws IOException {

		workbook.close();
		fis.close();
	}

}
