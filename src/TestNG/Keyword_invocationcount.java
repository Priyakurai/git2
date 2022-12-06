package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_invocationcount {
  @Test
  public void before() {
	  Reporter.log("befor method running",true);
	  
  }
  @Test(invocationCount = 5)
  public void TC1() {
	  Reporter.log("TC1 running",true);
  }
  
}
