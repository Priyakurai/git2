package unknown;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
				driver.get("https://paytm.com/");
				Point currentpos = driver.manage().window().getPosition();
				System.out.println("cirrent position id "+currentpos);
				Point p=new Point(90, 100);
				driver.manage().window().setPosition(p);
				System.out.println("newposition "+p);
				Point newposition=driver.manage().window().getPosition();
				
				System.out.println("new position "+newposition);
		
				
				
				
				
				
				
	}

}
