package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\9jully\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//String mytext = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText();
		//System.out.println("text present in web page "+mytext);
		//mytext.click("");
		//WebElement myele = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"))
	//	myele.click();
		//myele.getText();
		WebElement myele1 = driver.findElement(By.xpath("//a[text()='HOME']"));
		System.out.println(myele1.getText());
        myele1.click();

}
}