package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_study {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");					
        Thread.sleep(1000);
		//Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//a[text()='5000']"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//li[@class='placeholder'][4]"));
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();	
         
	}

}
