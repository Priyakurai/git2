package firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Newff {
  @Test
  public void Mytc() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\9jully\\selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	driver.get("https://paytm.com/");
  }
}
