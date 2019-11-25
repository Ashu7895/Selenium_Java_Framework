package framework;

import java.util.HashMap;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 * 
 */

public class Login extends BaseTest {

	/*
	 * This method wwill perform Login in Application.
	 * Elements are getting as Web Element and Login Data is fetching from Login Data Model class.
	 */
	public static void loginToApplication()
	{
		try {
		HashMap loginDetails =  LoginDataModel.loginData();	
		
		ReusableFunctions.clickOnButon(LoginModel.gettabBarElement());
		test.info("Clicked on Tab Button");
		ReusableFunctions.clickOnButon(LoginModel.getHelloSignInBarElement());
		test.info("Clicked on Hello Sign In Button");
		ReusableFunctions.enterText(LoginModel.getEmailElement(), loginDetails.get("Username").toString());
		test.info("Entering Mobile No. 1234567890");
		ReusableFunctions.clickOnButon(LoginModel.getSubmitElement());
		test.info("Clicked on Continue Button");
		ReusableFunctions.enterText(LoginModel.getPasswordBarElement(), loginDetails.get("Password").toString());
		test.info("Entering Password : My Password");
		ReusableFunctions.clickOnButon(LoginModel.getSubmitElement());
		test.info("Clicked on Tab Login Button");
		ReusableFunctions.clickOnButon(LoginModel.gettabBarElement());
		test.info("Clicked on Tab Login Button");
		String name = LoginModel.gettabBarElement().getText();
		test.info("Entered Text as "+name);
		System.out.print(name);
		}
		catch(Exception e)
		{
			test.fail("Test Got Failed Due to" + e);
		}
	}
		
}
