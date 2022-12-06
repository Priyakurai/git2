package unknown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Properties {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
				driver.get("https://facebook.com/");
			WebElement firstname = driver.findElement(By.id("email"));
			WebElement button = driver.findElement(By.name("login"));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='priya'", firstname);
			
			js.executeScript("arguments[0].click()", button);
			Thread.sleep(1000);
		//	TakeScreenFunction.screenshotmethod(driver,"button");
				
	}

}
