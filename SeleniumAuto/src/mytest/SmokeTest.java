package mytest;

import org.testng.annotations.Test;
import framework.BaseTest;
import framework.Login;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 */

public class SmokeTest extends BaseTest {
  
   @Test(description = "Test Case ID : Smoke-001 , Test case to verify login in application")
   public void verifyLoginInToApplication(){
	  test = extent.createTest("Test Case ID : Smoke-001 , Test case to verify login in application"+
			  								   "@test Author : Ashutosh" + "@test Category : Smoke Test Case");
	  Login.loginToApplication();
	  extent.flush();
	  driver.close();
  }
  
}
