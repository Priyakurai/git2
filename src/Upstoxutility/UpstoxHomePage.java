package Upstoxutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork.ScroolingFunction;
import screenshoot.ScreenshootgeneralMethod;

public class UpstoxHomePage {
	@FindBy(xpath="//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	@FindBy(id="funds")  private static WebElement funds;
	@FindBy(xpath="//div[text()='Logout']")private WebElement logoutButton;
	//variable initialization(constructor)	
		public void UpstoxHomepage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}	
	
public void validateUserID(WebDriver driver ,String expID) throws InterruptedException, IOException
{
Thread.sleep(1000);
	ScroolingFunction.scrollIntoView(driver,userID);
	
	String actualUserID = userID.getText();
	String expectedUserID=expID;
	ScreenshootgeneralMethod.screenshotmethod(driver,actualUserID);
	if(actualUserID.equalsIgnoreCase(expectedUserID))
	{
		
		System.out.println("actual and expected are matching TC passed");
	}
	
	else
	{
		
		System.out.println("actual and expected are not matching TC failed");
	}
}
	public void clickOnFunds(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		ScroolingFunction.scrollIntoView( driver,funds);
		funds.click();
		Thread.sleep(1000);
		
	}
	public void logoutFromApplication(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		ScroolingFunction.scrollIntoView( driver,userID);
		userID.click();
		Thread.sleep(1000);
		logoutButton.click();
		
		}
	public String getActualUserID(WebDriver driver)
	{
		String ActualUID=userID.getText();
				ScroolingFunction.scrollIntoView( driver,userID);	
		return ActualUID;
		
	}
	}

