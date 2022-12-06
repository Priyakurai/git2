package Upstoxutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseNew {
      protected  WebDriver driver;

	public void LaunchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get(UtilityNew.readDatafromPropertyFile("devurl"));
		driver.manage().window().maximize();
		UtilityNew.wait(driver, 1000);
	}

}
