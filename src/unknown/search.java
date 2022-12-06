package unknown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.google.co.in/");
				Thread.sleep(1000);
				driver.findElement(By.name("q")).sendKeys("Honda");
				List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@class='erkvQe'])[1]/li"));
				System.out.println(searchResult.size());
		for(WebElement s:searchResult)	
		{
			System.out.println(s.getText());
			String reqResult="Honda amaze";
			String actual=s.getText();
			if(reqResult.equals(actual))
			{
				s.click();
				break;
			}
			
			
		}
		Thread.sleep(1000);
		driver.findElement(By.linkText("Images")).click();
	}

}
