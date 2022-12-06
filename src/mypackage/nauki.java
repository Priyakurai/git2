package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nauki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
