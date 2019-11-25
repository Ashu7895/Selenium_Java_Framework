package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import excel.ExcelLibrary;

/**
 * @author Ashutosh Srivastava
 * Created by ashutosh.kaystha@gmail.com on 25/11/2019
 * 
 */

public class BaseTest implements AppConfig {

	// Declaring WebDriver
	public static WebDriver driver = null;
	public static ExtentReports extent = null;
	public static ExtentTest test = null;
	
		
	/*
	 * Declaring @Before to setup the browser , Launching the Application during setup
	 * Creating instance for Extent Manager to generate extent report
	 */
	@Parameters({ "browser" })
	@BeforeClass
	public void testSetup(String browser) {
		
		launchApplication(browser);
		extent = ExtentManager.GetExtent();
		}

	private void launchApplication(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.firefox.marionette", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
			// Passing the application link through Interface
			driver.navigate().to(APPLICATION_LINK);

		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\akumsrivasta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			// creating chrome driver instance
			driver = new ChromeDriver();
		    // Passing the application link through Interface
			driver.navigate().to(APPLICATION_LINK);
			driver.manage().window().maximize();
		}

		else if (browser.equalsIgnoreCase("chromeMobileBrowser")) {
			Map<String, Object> mobileEmulation = new HashMap<>();
			// mobileEmulation.put("Device name","Iphone 6");
			mobileEmulation.put("userAgent",
					"Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25)");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akumsrivasta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			driver = new ChromeDriver(chromeOptions);
			Dimension d = new Dimension(550, 850); // (x,y coordinators in pixels)
			driver.manage().window().setSize(d);
			driver.navigate().to(APPLICATION_LINK);
			
		} else {
			// If no browser passed throw exception
			throw new RuntimeException("Browser is not correct");
		}

	}

}
