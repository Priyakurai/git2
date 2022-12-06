package TestNG_xml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
	//i want A and D
  @Test
  public void A() {
	  Reporter.log("A TC is running",true);
  }
  @Test
  public void B() {
	  Reporter.log("B TC is running",true);
  }
  @Test
  public void C() {
	  Reporter.log("C TC is running",true);
  }
  @Test
  public void D() {
	  Reporter.log("D TC is running",true);
  }
  @Test
  public void E() {
	  Reporter.log("E TC is running",true);
  }
}
