package TestNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test11 {
	//i want A and D
	  @Test(groups = {"homepage","funds"})
	  public void A() {
		  Reporter.log("A TC is running",true);
	  }
	  @Test(groups = "funds")
	  public void B() {
		  Reporter.log("B TC is running",true);
	  }
	  @Test(groups = "homepage")
	  public void C() {
		  Reporter.log("C TC is running",true);
	  }
	  @Test(groups = "funds")
	  public void D() {
		  Reporter.log("D TC is running",true);
	  }
	  @Test(groups = "homepage")
	  public void E() {
		  Reporter.log("E TC is running",true);
  }
}
