package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcel {

	public static void main(String[] args) throws IOException {
		
		// ExcelFile--> WorkBook-->Sheet-->Rows-->Cells
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\ReadExcel.xlsx");
		 XSSFWorkbook  workbook = new XSSFWorkbook(file);
		XSSFSheet sheet =  workbook.getSheet("Sheet1");
		int noofrows= sheet.getLastRowNum();
		int noofcells=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of rows:" + noofrows);
		System.out.println("Number of cells:" + noofcells);
		
		for(int r=0;r<=noofrows;r++) {
			
		XSSFRow currentrow =sheet.getRow(r);
			
			for(int c=0;c< noofcells;c++) {
				
			XSSFCell currentcell =currentrow.getCell(c);
			String cellvalue= currentcell.toString();
			System.out.print(cellvalue+ "\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
//		  

	}

}
