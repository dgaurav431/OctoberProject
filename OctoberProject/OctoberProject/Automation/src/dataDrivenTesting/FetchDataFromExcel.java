package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_December_430Batch2023\\Automation\\testData\\ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String name = cell.getStringCellValue();
		
		System.out.println(name);
		
		String email = row.getCell(1).getStringCellValue();
		System.out.println(email);
		
		long phoneNo = (long)row.getCell(3).getNumericCellValue();
		System.out.println(phoneNo);
		
		boolean status = row.getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		System.out.println("===============================================");
		
		Row row2 = sheet.getRow(2);
		long phoneNo2 = (long)row2.getCell(3).getNumericCellValue();
		System.out.println(phoneNo2);
	}

}
