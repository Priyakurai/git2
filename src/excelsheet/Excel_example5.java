package excelsheet;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Excel_example5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ExcelSheetReadingMethod excel=new ExcelSheetReadingMethod();
		excel.Excelsheetreading(1, 1);
	}

}
