package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecplicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
				driver.get("https://www.discoveryplus.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
			WebElement signinButton = driver.findElement(By.xpath("//h6[text()='Sign In'])[2]"));
	WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(5000));
	w.until(ExpectedConditions.visibilityOf(signinButton));
	signinButton.click();
	
	
	
	
	
	}
	
	

}
