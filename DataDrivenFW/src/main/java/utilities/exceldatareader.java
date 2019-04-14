package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatareader 
{
	
	static String filePath;
	static String fileName;
	static String sheetName;
	static Workbook wb=null;
	
	public static void getExcelData() throws IOException
	{
		String excelpath = filePath + fileName ;
		File file = new File(excelpath);
		FileInputStream fis = new FileInputStream(file);
		int dotindex = fileName.indexOf(".");	
		String extnsn = fileName.substring(dotindex+1);
		
		if(extnsn.equalsIgnoreCase("xlxs"))
		{
			wb = new XSSFWorkbook(fis);
		}	
		else
		{
			wb = new HSSFWorkbook(fis);
		}
		
		Sheet sheet = wb.getSheet(sheetName);
		int lastrow = sheet.getLastRowNum();
		
		for(int i=2; i<=lastrow;i++)
		{
			Row rows = sheet.getRow(i);
			
		short lastcell = rows.getLastCellNum();
		for(int j=0; j<=lastcell; j++)
		{
			Cell cell = rows.getCell(j);
			String cellvalue = cell.getStringCellValue();
		}
			
    }
			
}
		
	public static void main(String[] args) throws IOException 
	{
	
		String filePath = "C:\\Users\\xbbnd0r\\workspace\\DataDrivenFW\\src\\test\\resources\\excelData.xlsx";
		String fileName = "excelData.xlsx";
		String sheetName = "sheet1";

	}

}
