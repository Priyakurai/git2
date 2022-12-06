package unknown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooftable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goodreturns.in/gold-rates/");
	List<WebElement> Datalist = driver.findElements(By.xpath("(table[@cellpadding='1'])[1]//td"));
	System.out.println("number of rows "+Datalist.size());
	
	List<WebElement> columns = driver.findElements(By.xpath("(table[@cellpadding='1'])[1]//tr[1]//td"));
	System.out.println("number of rows "+columns.size());
	for(WebElement d:Datalist)
	{
		System.out.println(d.getText());
	}
	System.out.println();
	System.out.println("+++++print prize without $++++++++++");
	for(int i=1;i<=Datalist.size()-1;i++)
	{
		WebElement row1 = Datalist.get(i);
		String rowdata = row1.getText();
		String s="$";
		 String[] temp = rowdata.split(s);
		 System.out.println("price of "+temp[0] +"is:"+temp[1]);
		
		
		
	}
	
	
	
	
	
	}


}
