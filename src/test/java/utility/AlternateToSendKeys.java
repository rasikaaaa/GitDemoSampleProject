package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateToSendKeys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].value='test testing';",firstname);
}
}
