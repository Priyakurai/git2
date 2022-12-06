import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://demoqa.com/alerts");
				Thread.sleep(1000);
				driver.findElement(By.id("alertButton")).click();
				Alert alt=driver.switchTo().alert();
				System.out.println(alt.getText());
				alt.accept();
				Thread.sleep(1000);
				driver.findElement(By.id("timerAlertButton")).click();
				Alert alt1=driver.switchTo().alert();
				alt1.accept();
				System.out.println(alt1.getText());
				
				
	}

}
