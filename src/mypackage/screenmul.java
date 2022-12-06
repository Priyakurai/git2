package mypackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenmul {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://meet.google.com/cah-otbq-nmx");
		driver.manage().window().maximize();
		File source = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 String s = RandomString.make(5);
		 System.out.println(s);
		File store=new File("D:\\selenium\\myscreenshot.jpg");
	FileHandler.copy(source, store);
		
	}

}
