package unknown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakeScreenFunction {
public static void screenshotmethod(WebDriver driver, WebElement element) throws IOException
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String str=RandomString.make(3);
	File store=new File("D:\\selenium\\myscreenshot\\"+str+".jpg");
	FileHandler.copy(source, store);
	
	
	}

 
}
