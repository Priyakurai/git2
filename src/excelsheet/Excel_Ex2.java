package excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
		FileInputStream myexcel=new FileInputStream(myfile);
		Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet1");
		int Lastrow = mysheet.getLastRowNum();
		System.out.println("last row no "+Lastrow);
		int totalnoofRow=Lastrow+1;
		System.out.println("total no of row "+totalnoofRow);
		int LAstCellNo=mysheet.getRow(0).getLastCellNum();
		System.out.println("LastCellNo "+LAstCellNo);
		int TotalNoOfcell=LAstCellNo;
		System.out.println("toatl cell "+TotalNoOfcell);
		System.out.println("==================");
		for(int i=0;i<=Lastrow;i++)
		{
	String value = mysheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(value);
		}
	
		System.out.println("==================");
		for(int i=0;i<=LAstCellNo-1;i++)
		{
		 String value1 = mysheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value1+" ");
		}
		
		System.out.println();
		System.out.println("==================");
		int lastrow=mysheet.getLastRowNum();
		int lastcell=mysheet.getRow(lastrow).getLastCellNum()-1;
		for(int i=0;i<=lastrow;i++)
		{
			
			for(int j=0;j<=lastcell-1;j++)
			{
				String value3 = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value3+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
