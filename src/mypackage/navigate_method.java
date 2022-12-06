package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(10000);
	     driver.navigate().to("https://business.phonepe.com/");	
	     Thread.sleep(10000);
	     driver.navigate().back();
	     Thread.sleep(10000);
	     driver.navigate().forward();
	     Thread.sleep(10000);
	     driver.navigate().refresh();
	     
	}

}
