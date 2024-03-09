package com.ddwithPrpertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {
	public String getDataFromePropertyFile(String key) throws Exception {
		FileInputStream file=new FileInputStream("../MAVEN_PROJECT/src/test/java/com/ddwithPrpertyFile/file2.propertie");
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);
		
	}
	public String getDataFromExcelSheet(String sheetname,int rownum,int cellnum) throws IOException {
		FileInputStream file = new FileInputStream("../MAVEN_PROJECT/SampleSheet_2.xlsx");
		Workbook book = null;
		try {
			book=WorkbookFactory.create(file);
		}catch(EncryptedDocumentException e){
			
		}
		Sheet sh = book.getSheet(sheetname);
		return sh.getRow(rownum).getCell(cellnum).toString(); 
		
	}

}
