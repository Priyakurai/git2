package Parallelandserialexecution;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void SetSize() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.phonepe.com/");
	Dimension defaultsize = driver.manage().window().getSize();
	System.out.println("default size is "+defaultsize);
	Dimension d=new Dimension(300, 1000);
	Thread.sleep(3000);
	 driver.manage().window().setSize(d);
	Dimension currentsize = driver.manage().window().getSize();
	System.out.println("current size is "+currentsize);
  }
}
