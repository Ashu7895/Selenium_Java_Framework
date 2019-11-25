package framework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 */

public class ReusableFunctions extends BaseTest{
	
	private static int waitUntil = 10;
		
	/* This method will enter a text in given element of a web page
	 * 
	 *@param element : element of which the action to be perform
	 *@param stringToBeEnter : value send by user to be enter in the given element
	 * 
	 * */
	public static void enterText(WebElement element , String stringToBeEnter)
	{
		try
		{
			element = (new WebDriverWait(driver, waitUntil)).until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(stringToBeEnter);
	    }
		catch(Exception e)
		{
			test.fail("Test failed due to exception : "+ e);
		}
	}
	
	/* This method will click on given element of a web page
	 * 
	 *@param element : element of which the action to be perform
	 * 
	 * */
	public static  void clickOnButon(WebElement element)
	{
		try
		{
			element = (new WebDriverWait(driver, waitUntil)).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		catch(Exception e)
		{
			test.fail("Test failed due to exception : "+ e);
		}
	}
	
}
