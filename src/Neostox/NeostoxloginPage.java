package Neostox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxloginPage {
	//Variable declaration
@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement userID;
@FindBy(xpath="(//a[text()='Sign Up'])[2]")private WebElement signup;

@FindBy(id="txt_accesspin") private WebElement password;
@FindBy(id="lnk_submitaccesspin")private WebElement submit;







	
//Variable initialization
public void NeostoxLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}
//variable uses
public void EnterUserID(String id)
{
      userID.sendKeys(id);
      Reporter.log("Sending mobile no 9359****65",true);
	}
public void clickonsignup()
{
	signup.click();
	Reporter.log("clicking on sign up button",true);
	}

public void enterpassword(String pass) throws InterruptedException
{
	password.sendKeys(pass);
	Reporter.log("sending password 15**",true);
	Thread.sleep(5000);
	submit.click();
	Reporter.log("clicking on submit button ",true);
	Thread.sleep(5000);
	}



}
