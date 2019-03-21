package qa.com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader_Util {

	public static void main(String[] args) throws Exception 
	{
	  String projectPath = System.getProperty("user.dir");
	  String filePath = projectPath + "\\src\\main\\java\\com\\qa\\data\\" ;
	  ExcelDataReader_Util.readExcelData(filePath, "excelData.xlsx", "testData");
	}

	public static void readExcelData(String filePath, String fileName, String sheetName) throws Exception
	{
		Workbook workbook;
		String excelPath = filePath + fileName ;
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		
		int dotindex = fileName.indexOf(".");
		String extension = fileName.substring(dotindex+1);
		
		if(extension.equalsIgnoreCase("xlsx"))
		{
			workbook = new XSSFWorkbook(fis);
			Sheet sheet	 = workbook.getSheet(sheetName);
			int lastrownum = sheet.getLastRowNum();			
			
			for(int i=0 ; i<=lastrownum; i++)
			{
				Row row = sheet.getRow(i);
				short lastcellnum = row.getLastCellNum();
				
				for(int j=0; j<=lastcellnum; i++)
				{
					Cell cell = row.getCell(j);
					String cellvalue = cell.getStringCellValue();
					System.out.println(cellvalue);
				}				
				System.out.println("");
			}		
			
		}
		
	}
	
}
