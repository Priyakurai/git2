package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
				driver.get("https://www.discoveryplus.in/");
				//Thread.sleep(5000);
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
				driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
								
				
				
				
				
				
				
				
				
	}

}
