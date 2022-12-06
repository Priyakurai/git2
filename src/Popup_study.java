import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l_2doB4z']")).click();
	}

}
