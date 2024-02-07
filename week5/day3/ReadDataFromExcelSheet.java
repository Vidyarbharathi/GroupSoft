package week5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws IOException {

		//step 1-set path of the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
	
	//step 2- go to the sheet
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//step 3-get into row
		int rowCount = sheet.getLastRowNum();
		System.out.println("Number of rows :"+rowCount);
		
		//include header 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Include Header also :"+physicalNumberOfRows);
		
		//step 4 -get cell count
		XSSFRow row = sheet.getRow(1);
		short cellCount = row.getLastCellNum();
		System.out.println("Number of cells:"+cellCount);
		
		//single data to read from excel sheet
		
		String data = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(data);
		
		//read all the value from excel sheet
		
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j <cellCount; j++) {
				
				String allData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(allData);
			}
		}
	
	wb.close();
	}

}
