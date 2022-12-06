package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class a_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.guru99.com/drag-drop-selenium.html");
		//find element
	WebElement source = driver.findElement(By.xpath("//a[text()='5000']"));
		WebElement dest = driver.findElement(By.id("amt8"));
		Actions act= new Actions(driver);
		act.dragAndDrop(source, dest).perform();
		
	}

}
