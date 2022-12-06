package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class normal_class {
  @Test
  public void KiteLogin() {
	  System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("Test case is passed",true);
  }
}
