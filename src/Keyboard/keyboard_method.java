package Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://facebook.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement createnewaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	Actions act =new Actions(driver);
	Thread.sleep(4000);
	act.click(createnewaccount).perform();
	Thread.sleep(1000);
	WebElement FN = driver.findElement(By.name("firstname"));
	act.keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("riyanka").build().perform();
	Thread.sleep(1000);
	WebElement SN = driver.findElement(By.name("lastname"));
	act.keyDown(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("K").keyUp(Keys.SHIFT).sendKeys("urai").build().perform();
	Thread.sleep(1000);
	WebElement MN = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	act.keyDown(Keys.TAB).sendKeys("9359668065").build().perform();
	
	
	WebElement Day = driver.findElement(By.id("day"));
	act.click(Day).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	
	//act.sendKeys(Keys.ENTER).perform();
	for(int i=0;i<=3;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
	}
	
	act.sendKeys(Keys.ENTER).perform();
	WebElement Gender = driver.findElement(By.xpath("(//INPUT[@type='radio'])[1]"));
	act.click(Gender).perform();
	
	
	
	
	
	
	}

}
