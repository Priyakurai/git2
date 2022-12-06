package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_dependsonmethod {
  @Test(priority=1)
  public void login() {
	  Reporter.log("login sucess",true);
  }
  @Test(priority=2)
  public void VerifyPin() {
	  Reporter.log("Verify PIn sucess",true);
  }
@Test(dependsOnMethods="login")
public void Logout()
{
	Reporter.log("logout success",true);
	}
}
