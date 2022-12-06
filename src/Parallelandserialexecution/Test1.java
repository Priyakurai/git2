package Parallelandserialexecution;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void SetPosition() {
	  System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://paytm.com/");
	Point defaultposition = driver.manage().window().getPosition();
	System.out.println("default position is "+defaultposition);
	Point p=new Point(190, 180);
	driver.manage().window().setPosition(p);
	Point newposition = driver.manage().window().getPosition();
	
	System.out.println("new position is "+newposition);
	
	
	
	
	
	
	
	
  }
}
