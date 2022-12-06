package unknown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.xpath("//button[@class='_2KpZ6l_2doB4z']")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("q")).sendKeys("iphone14");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(1000);
				String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
				System.out.println("review of product are "+review);
	}

}
