package excelsheet;
  
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
		
		Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet2");
		int totalrow=mysheet.getLastRowNum();
		short totalcell	=(short) (mysheet.getRow(0).getLastCellNum()-1);
		
		for(int i=0;i<=totalrow;i++)
		{
			for(int j=0;j<=totalcell;j++)
			{
				
				Cell myCell=mysheet.getRow(i).getCell(j);
				CellType cellDataType=myCell.getCellType();
				if(cellDataType==CellType.NUMERIC)
				{
					System.out.print(myCell.getNumericCellValue()+" ");
				}
				else if(cellDataType==CellType.STRING)
				{
					System.out.print(myCell.getStringCellValue()+" ");
				}
				
				else if(cellDataType==CellType.BOOLEAN)
				{
					System.out.print(myCell.getBooleanCellValue()+" ");
					
				}
				else if(cellDataType==CellType.BLANK)
				{
				System.out.print(" ");
				}
				
				
				
				
				
				
				
				
				
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
