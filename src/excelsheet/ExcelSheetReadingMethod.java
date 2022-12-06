package excelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetReadingMethod {
public void Excelsheetreading(int row,int cell) throws EncryptedDocumentException, IOException
{
File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
String value=WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(row).getCell(cell).getStringCellValue();
System.out.println(value);









}
}
