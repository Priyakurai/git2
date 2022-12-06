package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//switch to parent frame
		driver.switchTo().frame("frame1");
	 String parentframe = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	System.out.println("Parent Frame is "+parentframe);	
	//switch to child frame
	Thread.sleep(1000);
	WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(childframe);
	String childiframe = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println("Child Frame is "+childiframe);
	
	}
        
}
