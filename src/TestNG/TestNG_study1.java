package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_study1 {
  @Test//single tc
  public void googletest() {
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("google is launch");
		driver.manage().window().maximize();
		Reporter.log("google is working fine");
	driver.get("https://google.co.in/");
	
	
  }
  @Test
  public void googletest1()
  {
	  
  }
 
}
