package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling_Using_action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://paytm.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	WebElement handle=driver.findElement(By.xpath("(//div[text()='Recharge'][1])"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	Actions act=new Actions(driver);
	act.scrollToElement(handle).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	act.click(handle).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	WebElement mob = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])[1]"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	act.sendKeys(mob, "9359668065").perform();
	}

}
