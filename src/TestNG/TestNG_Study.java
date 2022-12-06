package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TestNG_Study {
  @Test
  public void f() {
	  
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://login-v2.upstox.com/");
	
	driver.manage().window().maximize();
	//upstok_login login= new upstok_login(driver);  
	  
	  
  }
  
}
