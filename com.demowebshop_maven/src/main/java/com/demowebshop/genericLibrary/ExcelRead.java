package com.demowebshop.genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead implements FrameworkConstant {
public static String readStringValue(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	File f= new File(Excel_Path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sheet =wb.getSheet(sheetName);
	return sheet.getRow(row).getCell(cell).toString();
}
public static double readNumericValue(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	File f= new File(Excel_Path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sheet =wb.getSheet(sheetName);
	return sheet.getRow(row).getCell(cell).getNumericCellValue();
}
public static boolean readBooleanValue(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	File f= new File(Excel_Path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sheet =wb.getSheet(sheetName);
	return sheet.getRow(row).getCell(cell).getBooleanCellValue();
}
public static String [][]multipleRead(String sheetName) throws EncryptedDocumentException, IOException {
	File f= new File(Excel_Path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sheet =wb.getSheet(sheetName);
	int row_size= sheet.getPhysicalNumberOfRows();
	int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
	String[][]data=new String[row_size-1][col_size];
	for(int i=0;i<row_size-1;i++) {
		for(int j=0;j<col_size;j++) {
			data[i][j]=sheet.getRow(i+1).getCell(j).toString();
		}
	}
	return data;
}
}
