package week5.day4.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void readExcelData() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		System.out.println("The total number of rows: "+rowCount);
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("The total number of columns: "+columnCount);
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = eachRow.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				
			}
		}
        wb.close();
	}

}