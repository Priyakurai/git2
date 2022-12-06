package Verification_using_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTC {
  @Test
  public void assertEquals() {
	  String p="pune";
	  String q="pune";
	  Assert.assertEquals(p, q,"aand b is equal tc passed");
	  Reporter.log("tc is failed");
  }
  
  
  
  
  
}
