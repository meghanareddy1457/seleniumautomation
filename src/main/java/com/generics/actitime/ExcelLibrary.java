package com.generics.actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary  implements autoconstant{
	public static String getcellvalue(String path,String sheet,int row,int cell) throws IOException
	{
		FileInputStream fis=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;

		

}
}
