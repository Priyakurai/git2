package mypackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webele_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		Thread.sleep(3000);
		 WebElement month = driver.findElement(By.id("month"));
		 Select smonth = new Select(month);
		 Thread.sleep(3000);
		 //smonth.selectByVisibleText("Aug");
        for(int i=0;i<=11;i++)
		 {
		 Thread.sleep(2000); 
		    smonth.selectByIndex(i);
	     }
		Thread.sleep(1000); 
		//System.out.println(smonth.isMultiple());
		
		List<WebElement> allmonths = smonth.getOptions();
		for (WebElement am:allmonths)
		{
			System.out.println(am.getText());
			
		}
		System.out.println("=============");
		Iterator<WebElement> it = allmonths.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		System.out.println("=============");
		Iterator<WebElement> it1 = allmonths.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next().getText());
		}
		for(int i=0;i<=allmonths.size()-1;i++)
		{
			System.out.println(allmonths.get(i).getText());
		}
		
		 WebElement day = driver.findElement(By.id("day"));
		 Select sday=new Select(day);
		 Thread.sleep(3000);
		 sday.selectByValue("15");
		 WebElement year = driver.findElement(By.id("year"));
		 Select syear =new Select(year);
		 Thread.sleep(3000);
		 syear.selectByVisibleText("1991");
	}

	
		
	}


