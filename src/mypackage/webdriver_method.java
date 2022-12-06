package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//1 get()
		driver.get("https://apps.google.com/meet/");
		//2 close()
		//driver.close();
		//3 quit()
		//driver.quit();
		//4 minimize
		driver.manage().window().minimize();
		//5 maximize
		driver.manage().window().maximize();
		//navigate
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		//get title
		driver.get("https://vctcpune.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		//get currentUrl
		driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
		String result = driver.getCurrentUrl();
	System.out.println("url is "+result);
		
	}

}
