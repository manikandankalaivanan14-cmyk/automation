package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\WriteExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet newsheet= workbook.createSheet("Testdata");
		XSSFRow row1= newsheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("123");
		row1.createCell(2).setCellValue("Welcome");
		row1.createCell(3).setCellValue("123.344");
		XSSFRow row2= newsheet.createRow(1);
		row2.createCell(0).setCellValue("JAVA");
		row2.createCell(1).setCellValue("Python");
		row2.createCell(2).setCellValue("selenium");
		row2.createCell(3).setCellValue("playwright");
		XSSFRow row3= newsheet.createRow(2);
		row3.createCell(0).setCellValue("AI");
		row3.createCell(1).setCellValue("ML");
		row3.createCell(2).setCellValue("Devops");
		row3.createCell(3).setCellValue("playwright");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
		
		
	}

}
