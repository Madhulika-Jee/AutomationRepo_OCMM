package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * it is used to read data from excel workbook and properties file from data folder
 * @author Madhulika
 *
 */
public class FileLib {
	/**
	 * its used to read date from common data properties file based on Key
	 * @param Key
	 * @return
	 * @throws IOException 
	 * @throws Throwable
	 */
public String getPropertyFileData(String Key) throws Throwable
{
	FileInputStream fis= new FileInputStream("./Data/commonData.properties");
	Properties pObj= new Properties();
	pObj.load(fis);
	String value= pObj.getProperty(Key);
	return value;
	
}
	/**
	 * its used to read data from testscript data xls file based on user arguments
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @return String Data
	 * @throws IOException 
	 */
public String getExcelData(String sheetName, int rowNum , int celNum) throws IOException
{
	FileInputStream fis= new FileInputStream("./Data/testData.xlsx.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh= wb.getSheet(sheetName);
	Row row= sh.getRow(rowNum);
	String data= row.getCell(celNum).getStringCellValue();
	
	wb.close();
	return data;
}
}
