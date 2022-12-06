package Upstoxutility;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.sql.Driver;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class UpstoxUsernameUsingPropertyFile extends BaseNew
{
	
	UpstoxLoginPage login;
	UpstoxPasscodePage passcode;
	UpstoxWelcomePage welcome;
	UpstoxHomePage home;
	String TCID="5555";
	
	@BeforeClass
	  public void openBrowser() throws IOException {
		LaunchBrowser();
		Reporter.log("launching browser",false);
	//	login=new UpstoxLoginPage(driver);
		//passcode=new UpstoxPasscodePage(driver);
		//welcome =new UpstoxWelcomePage(driver);
		//home=new UpstoxHomePage(driver);
		
		
		
		  
	  }
	
  
		
	


  @BeforeMethod
  public void loginToUpstox() throws IOException {
	login.SendUserNames(UtilityNew.readDatafromPropertyFile("userID"))  ;
	login.sendPassword(UtilityNew.readDatafromPropertyFile("password"));
	login.clicksignInButton();
	Reporter.log("send user name and password and signing in ",true);
	UtilityNew.wait(driver, 1000);
	passcode.enterPassCode(UtilityNew.readDatafromPropertyFile("passcode"));
	Reporter.log("sending passcode and signing in..",true);
	UtilityNew.wait(driver, 5000);
	welcome.clickOnnoIamGoodButton();
	Reporter.log("click on i am goood button..",true);
	UtilityNew.wait(driver, 5000);
	 
  }
@Test
public void validateUserName() throws IOException {
	//Assert.assertEquals(home.getActualUserID(driver);
	UtilityNew.readDatafromPropertyFile("expUserName");
	UtilityNew.screenshot(driver, TCID);
	Reporter.log("validating user name and taking screenshot",true);
	
}
  @AfterMethod
  public void logoutFromUpstox() throws InterruptedException {
	  UtilityNew.wait(driver, 1000);
	  home.logoutFromApplication(driver);
	  Reporter.log("logging out ",true);
  }

  

  @AfterClass
  public void closerowser() {
	  Reporter.log("closing browser ",true);
	  driver.close();
  }

  
}
