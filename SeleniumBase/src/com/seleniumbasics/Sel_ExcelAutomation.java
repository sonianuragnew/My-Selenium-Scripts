package com.seleniumbasics;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sel_ExcelAutomation {

	static String projectPath;
	static String filePath;
	
	public static void main(String[] args) throws Exception 
	{
		projectPath = System.getProperty("user.dir");
		filePath = projectPath + "\\src\\excelFiles\\";
		Sel_ExcelAutomation.readExcel(filePath, "excelData.xlsx", "testdata");
	}

	public static void readExcel(String filePath, String fileName, String sheetName) throws Exception 
	{
		String excelPath = filePath + fileName ;
		File file = new File (excelPath);
		FileInputStream fis = new FileInputStream(file);
		
		int dotIndex = fileName.indexOf(".");
		String extension = fileName.substring(dotIndex);
		
		Workbook wb = null;
		if (extension.equals("xlsx"))
		{
			wb = new XSSFWorkbook(fis);
		}
		
		Sheet sheet = wb.getSheet(sheetName);
		int rowNum = sheet.getLastRowNum();
		
		for(int i = 0; i<rowNum; i++)
		{
			Row row = sheet.getRow(i);
			short colNum = row.getLastCellNum();
			
			for(int j = 0; j<colNum; j++)
			{
				Cell cell = row.getCell(j);
				String cellInfo = cell.getStringCellValue();
				System.out.print("Value in the Cell is : "+cellInfo);
			}
			
		}
		System.out.println("");
	}
	
}
