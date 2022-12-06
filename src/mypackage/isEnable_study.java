package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		//System.out.println(password.isEnabled());
		WebElement getOTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = getOTPbutton.isEnabled();
		System.out.println("otp button enable status "+result);
		WebElement getmobileno = driver.findElement(By.id("mobileNumber"));
		getmobileno.sendKeys("77584476844");
		boolean result1 = getOTPbutton.isEnabled();
		System.out.println("otp button enable status "+result1);
		getOTPbutton.click();
	}

}
