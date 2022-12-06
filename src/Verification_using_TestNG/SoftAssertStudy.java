package Verification_using_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void softAssertUse() {
	  String a="ABC";
	  String b="ABC";
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(a, b,"A and B not equal TC failed");
	  soft.assertNotNull(b,"B is not nulltc failed");
	  soft.assertAll();
	  
  }
}
