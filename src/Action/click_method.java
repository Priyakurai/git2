package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About us']"));
		
		//act.moveToElement(aboutus).perform();
		act.click().perform();
		act.moveToElement(aboutus).click().build().perform();
		act.click(aboutus).perform();
	}

}
