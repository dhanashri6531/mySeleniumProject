package com.genericcode;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Workbook;

public class HashMapCode {
	public static HashMap<String , String>hashmapdata;
	
	public static void test() throws IOException {
		hashmapdata=new HashMap<String, String>();
		Workbook book = GenericCode.getworkbookData();
		int row = GenericCode.getrow();
		int cell=GenericCode.getcell();
		System.out.println(cell+" "+row);
		
		// for rows
		for(int i=0;i<=row;i++) {
			String key=null,value=null;
			int j=0;
			key=book.getSheet("Sheet1").getRow(i).getCell(j).toString();
			for(;j<cell;j++) {
				value=book.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
			hashmapdata.put(key, value);
		}
	}

}
