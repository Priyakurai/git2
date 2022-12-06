package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://vctcpune.com/");
		Thread.sleep(10000);
		driver.get("https://www.flipkart.com/");
		//driver.close();
		//driver.quit();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		
		
	}

}
