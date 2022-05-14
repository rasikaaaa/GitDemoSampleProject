package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWithScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	
	username.sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Screenshot.captureScreenshot(driver,"scr2");
}
}
