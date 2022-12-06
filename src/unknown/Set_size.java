package unknown;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
				driver.get("https://paytm.com/");
				Dimension ds = driver.manage().window().getSize();
			System.out.println("defaultsize "+ds);	
				
				Dimension d=new Dimension(300, 1000);
				Thread.sleep(3000);
			driver.manage().window().setSize(d);
			System.out.println("currentsize "+d);
			Dimension maxsize=new Dimension(300, 1000);
			// driver.manage().window().maximize();
			driver.manage().window().setSize(maxsize);
			System.out.println("maxsize "+maxsize);
			
	}

}
