import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestScript2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String path = "../MAVEN_PROJECT/SampleSheet_2.xlsx";

		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int rownum = 0;rownum<=2;rownum++) {
			Row r = sh.getRow(rownum);
			
		for(int col=0;col<=2;col++){
			Cell c =  r.getCell(col);
			String data = c.getStringCellValue();
			System.out.println(data);
		}
		}
	}

}
