package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage { 
	WebDriver driver;
public LoginPage(WebDriver driver) {  //constructor
		this .driver=driver;//if we take only driver then NPE is arrive because driver is null so we take this.driver 
	}
public void entercredentials() {
	driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
}
public void clickOnLogin()
{
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
public void enterPin() {
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);//NoSuchElementException is arrive if java code speed is fast so we use implicit wait
	driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
public String getTitleOfPage() {
	 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@type='button']"));
   String titleogpage = driver.getTitle();
	return titleogpage ;//due to not equal of title this test case fail assertion error will arise
}
}
