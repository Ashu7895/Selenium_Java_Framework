package framework;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginModel extends BaseTest implements LoginOjectPageCollection {
	
	/*
	 * This class reponsible for convert locators into Web Element and return Web Element to
	 * different class to perform certain operations
	 */
	
	public static  WebElement gettabBarElement()
	{
	return driver.findElement(By.xpath(TABBAR));
	}
	
	public static  WebElement getHelloSignInBarElement()
	{
	return driver.findElement(By.xpath(HELLOSIGNIN));
	}
	
	public static  WebElement getEmailElement()
	{
	return driver.findElement(By.xpath(EMAIL));
	}
	
	public static  WebElement getSubmitElement()
	{
	return driver.findElement(By.xpath(SUBMIT));
	}
	
	public static  WebElement getPasswordBarElement()
	{
	return driver.findElement(By.xpath(PASSWORD));
	}
	
	public static  WebElement getLoginElement()
	{
	return driver.findElement(By.xpath(LOGIN));
	}
		
}
