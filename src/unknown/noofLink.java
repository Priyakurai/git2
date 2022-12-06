package unknown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noofLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.google.co.in/");
				Thread.sleep(1000);
				List <WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println(links.size());
				for(WebElement l:links) 
				{
					System.out.println(l.getText());
				}
				
				
				
	}

}
