package unknown;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGeneralMethod {
public static String ExcelMethod(int rows,int cells) throws EncryptedDocumentException, IOException
{
	File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
	
	Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet2");
	
	String value=mysheet.getRow(rows).getCell(cells).getStringCellValue();
	System.out.println(value);
	return value;
	
}
}
