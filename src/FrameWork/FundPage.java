package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundPage {
@FindBy(xpath="//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")private WebElement avaiablefunds;

//variable initialization(constructor)	
	public FundPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void cheakAvailablefunds()
	{
		String myfunds = avaiablefunds.getText();
		System.out.println("my funds is "+myfunds);
	}
	
	
}
