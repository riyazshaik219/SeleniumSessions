package ExcelWriting;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingIntoExcel {
	
public static void main(String[] args) throws Exception {
	FileOutputStream file = new FileOutputStream("D:\\PracticeExcel.xlsx");
	XSSFWorkbook wkbs = new XSSFWorkbook();
	XSSFSheet s = wkbs.createSheet("TestSheet");
	Row row1 = s.createRow(0);
	Row row2 =s.createRow(1);
	Cell cell1 = row1.createCell(0);
	cell1.setCellValue("Riya");
	Cell cell2 = row1.createCell(1);
	cell2.setCellValue("mits");
	Cell cell3 = row1.createCell(2);
	cell3.setCellValue(100);
	Cell cell4 = row1.createCell(3);
	cell4.setCellValue(200);
	Cell secondrow1= row2.createCell(0);
	secondrow1.setCellValue("shaik");
	Cell secondrow2=row2.createCell(1);
	secondrow2.setCellValue(500);
	
	wkbs.write(file);
	
	
	
}
}
