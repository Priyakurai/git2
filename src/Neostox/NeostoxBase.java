package Neostox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import Upstoxutility.UtilityNew;

public class NeostoxBase {
protected static WebDriver driver;
 public void LaunchBrowser() throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
driver =new ChromeDriver();
driver.get(UtilityNew.readDatafromPropertyFile("devurl"));
	driver.manage().window().maximize();
	UtilityNew.wait(driver, 2000);
}

}


