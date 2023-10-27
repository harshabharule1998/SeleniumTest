package com.autospace.utils;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	HashMap<String,String> credentials;
	public static void main(String[] args) throws IOException {


		ExcelReader reader = new ExcelReader();
		HashMap<String,String> data=reader.readUserCredentialsFromExcel();
		System.out.println(data.get("id"));
		System.out.println(data.get("pass"));

	}

	public HashMap<String,String> readUserCredentialsFromExcel() throws IOException {

		FileInputStream file = new FileInputStream(new File("C:\\Users\\ASUS\\git\\SeleniumJenkins\\SeleniumTest\\UserData.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowiterator = sheet.iterator();
		rowiterator.next();

		Row row2 = rowiterator.next();
		Iterator<Cell>cellIterator = row2.cellIterator();

		Cell cell = cellIterator.next();
		String username = cell.getStringCellValue();
		cell = cellIterator.next();
		String password = cell.getStringCellValue();

		//System.out.println("username "+username+" password  "+password);

		credentials=new HashMap<String,String>();
		credentials.put("id", username);
		credentials.put("pass", password);
		return credentials;
	
		/*while(rowiterator.hasNext())
		{
			Row row = rowiterator.next();
			Iterator<Cell>cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				System.out.println(cell.getStringCellValue());
			}*/
	}
}

