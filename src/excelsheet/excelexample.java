package excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelexample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
FileInputStream myexcel = new FileInputStream(myfile);
String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	 double value1 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(0).getNumericCellValue();
	System.out.println(value1);
	 boolean value2 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(4).getCell(0).getBooleanCellValue();
	System.out.println(value2);
	 String value3 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(5).getCell(0).getStringCellValue();
	System.out.println(value3);
	}
	

}
