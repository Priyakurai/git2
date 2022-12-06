package screenshoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMethod {
public static void screenshotgeneral(WebDriver driver, String name ) throws IOException 
{
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;
File destination=new File("D:\\selenium\\myscreenshot.jpg");
FileHandler.copy(src, destination);
}
}
