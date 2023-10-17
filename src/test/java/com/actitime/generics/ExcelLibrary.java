package com.actitime.generics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstants
{
	public static String getcellValue(String sheet , int row , int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		Workbook wb=new XSSFWorkbook(fis); 
		String cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
}