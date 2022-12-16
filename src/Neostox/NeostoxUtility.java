package Neostox;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;



public class NeostoxUtility {
	public static String readDatafromPropertyFile(String key) throws IOException
	{
		

		//create object of properties 
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\sumit\\eclipse-workspace\\9jullyC Selenium\\src\\Upstoxutility\\UtilityNew.java");
		prop.load(myfile);
		
		
		String Value=prop.getProperty(key);
		return Value;
	}
	public static void wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
	public static void screenshot(WebDriver driver,String TCID) throws IOException {
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File store=new File("D:\\selenium\\myscreenshot\\"+TCID+".jpg");
		FileHandler.copy(source, store);
		
		
	}
	
	public static String ExcelGeneralM1(String str,int r,int c) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
	
		String value=WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(r).getCell(c).getStringCellValue();
		System.out.println(value);
         return value;

		
	}
	public static String ExcelGeneralM1(String str,int r,int p) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\9jully\\selenium\\9jullyc.xlsx");
	
		String value=WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(r).getCell(c).getStringCellValue();
		System.out.println(value);
         return value;

	public static Object readPropertyFi(String string) {
	
		return null;
	}
	
}
