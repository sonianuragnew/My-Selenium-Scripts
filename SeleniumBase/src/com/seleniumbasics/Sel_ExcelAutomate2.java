package com.seleniumbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sel_ExcelAutomate2 {

	public static void main(String[] args) throws Exception 
	{
		String filePath = System.getProperty("user.dir")+"\\src\\excelFiles\\";
		
		readExcel(filePath, "excelData.xlsx","testdata");
	}

	public static void readExcel( String filePath, String fileName, String sheetName) throws Exception
	{
		
		Workbook wb = null;
		
		File file = new File(filePath+fileName);
		
		FileInputStream fis = new FileInputStream(file);
		
		int dot = fileName.indexOf(".");
		
		String fileExtnsn = fileName.substring(dot+1);
		
		if(fileExtnsn.equals("xls"))
		{
			wb = new HSSFWorkbook(fis);
		}
		else
		{
			wb = new XSSFWorkbook(fis);
		}
		
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
	
		for(int i=0; i<=rowCount; i++)
		{
			Row row = sheet.getRow(i);
			int lastCellNum = row.getLastCellNum();
			
			for(int j =0; j<lastCellNum; j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data+" ");
			}
			System.out.println("");
		}
		wb.close();
		fis.close();		
	}
	
}
