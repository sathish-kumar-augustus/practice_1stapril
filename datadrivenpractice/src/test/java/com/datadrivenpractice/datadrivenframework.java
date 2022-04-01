package com.datadrivenpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivenframework {
	public static void main(String[] args) throws Throwable {
	/*System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TAHSILDAR\\Eclipse16 Workspace\\pom_pagefactory\\driver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");*/
					
					
	FileInputStream fis = new FileInputStream("C:\\Users\\TAHSILDAR\\Eclipse16 Workspace\\datadrivenpractice\\userdata\\dummy-datadriven.xls");
	Workbook workbook = new HSSFWorkbook(fis);
	Sheet sheet = workbook.getSheetAt(0);
	Iterator<Row> rowsize = sheet.rowIterator();
	System.out.println(rowsize);

	}

}
