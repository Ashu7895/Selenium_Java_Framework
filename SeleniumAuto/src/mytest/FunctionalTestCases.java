package mytest;
import org.testng.annotations.Test;

import excel.ExcelLibrary;
import framework.BaseTest;
import framework.Login;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 */

public class FunctionalTestCases extends BaseTest {
	
	  @Test(description = "Test Case ID : Smoke-001 , Test case to verify login in application")
	  public void TestMethod(){
	  test = extent.createTest("Test Case ID : Func-001 , Test case to verify login in application"+
					   					  "@test Author : Ashutosh" + "@test Category : Functional Test Case");
	  Login.loginToApplication();
	  extent.flush();
	  driver.close();
	  }

}
