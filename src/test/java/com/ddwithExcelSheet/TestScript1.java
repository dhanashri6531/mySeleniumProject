package com.ddwithExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestScript1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		String path="../MAVEN_PROJECT/SampleSheet.xlsx";
		FileInputStream file = new FileInputStream(path);
		       Workbook wb = WorkbookFactory.create(file);
		       Sheet sh = wb.getSheet("Sheet1");
		          Row r = sh.getRow(1);
		         Cell c = r.getCell(0);
		         double data = c.getNumericCellValue();
		        System.out.println( data);
		         
	}

}
