package Notification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_option {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		ChromeOptions opt =new ChromeOptions(); 
		opt.addArguments("--disable-infobars");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.justdial.com/");
		Thread.sleep(5000);
		String myText=driver.findElement(By.xpath("//span[text()='Popular Services']")).getText();
		System.out.println("text is "+myText);
				
				
				
				
				
				
				
				
				
			
	}

}
