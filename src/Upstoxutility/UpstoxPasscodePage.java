package Upstoxutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscodePage {
	//variable declaration
		@FindBy(name="yob")  private WebElement passcodeField;
		
	//variable initialization(constructor)	
		public void UPstoxPasscodePage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}
	//variable usage(method)	
		public void  enterPassCode(String pass)
		{
			
			passcodeField.sendKeys(pass);
		}
}
