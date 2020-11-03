package ExcelWriting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadingFromExcel {
	public static void main(String[] args) throws IOException {
		
		ArrayList a = new ArrayList();
		FileInputStream File = new FileInputStream("D://PracticeExcel.xlsx");
		XSSFWorkbook wbks = new XSSFWorkbook(File);
		XSSFSheet sheet = wbks.getSheet("TestSheet");
		
		Iterator rowitr = sheet.iterator();
		while(rowitr.hasNext()) {
			Row rowdata = (Row)rowitr.next();
			
			Iterator cellitr = rowdata.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata=(Cell)cellitr.next();
				
				if(celldata.getCellTypeEnum()==CellType.STRING) {
					a.add(celldata.getStringCellValue());
				}
				if(celldata.getCellTypeEnum()==CellType.NUMERIC) {
					a.add(celldata.getNumericCellValue());
				}
				if(celldata.getCellTypeEnum()==CellType.BOOLEAN) {
					a.add(celldata.getBooleanCellValue());
				}
			}
		}
		System.out.println(a);
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("riyaz")) {
				System.out.println(a.get(i));
				System.out.println(a.get(i+1));
				System.out.println(a.get(i+2));
				System.out.println(a.get(i+3));
				System.out.println(a.get(i+4));
				System.out.println(a.get(i+5));
				System.out.println(a.get(i+6));
				System.out.println(a.get(i+7));
				
				
			}
		}
		
	}
}