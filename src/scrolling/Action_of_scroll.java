package scrolling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import unknown.TakeScreenFunction;

public class Action_of_scroll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");

	driver.manage().window().maximize();
	WebElement shrilanka = driver.findElement(By.xpath("//div[text()='Oman vs Saudi Arabia, 1st Match']"));
	Actions act=new Actions(driver);
	act.scrollToElement(shrilanka).perform();
	String text=shrilanka.getText();
			System.out.println(text);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			TakeScreenFunction.screenshotmethod(driver,shrilanka);
	}

}
