package unknown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingtoview {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			//driver.manage().window().maximize();
					driver.get("https://paytm.com/");
					Thread.sleep(1000);
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("window.scrollBy(1000.900)");
		}

		public static void scrollIntoView(WebDriver driver, WebElement userID) {
			// TODO Auto-generated method stub
			
		}
	}


