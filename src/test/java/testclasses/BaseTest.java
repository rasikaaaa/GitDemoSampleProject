package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;
import pages.LoginPage;
import utility.ReadDataFromConfig;


public class BaseTest {
public static WebDriver driver;
public LoginPage lp;
public DashBoard db;
@BeforeSuite
public void initBrowser() throws IOException  {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options= new ChromeOptions ();
	options.addArguments("--disable-notifications");
	options.addArguments("--incognito");
	options.addArguments("--start-maximized");
	 driver =new ChromeDriver(options);
	driver.manage().window().maximize();	driver.get("https://kite.zerodha.com/");
	//String url = ReadDataFromConfig.getPropData("testsiteurl");
	//driver.get(url);
	

}
@AfterSuite
public void tearDown()
{
	driver.quit();
}
@BeforeClass
public void objectCreation()
{
	 lp=new LoginPage(driver);
	 db=new DashBoard(driver);
}
}
