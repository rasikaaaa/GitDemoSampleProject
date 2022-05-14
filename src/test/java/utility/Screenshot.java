package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	//WAP to take the screenshot and call that method into another class
	public static String captureScreenshotWithPath(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		//String path = "E:\\capturescreenshot\\"+filename+".png";
		//alternate way to define path
		String path=System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";
		
		File destination= new File(path);//calling this method in another class
		FileHandler.copy(source, destination);
		return path;
	}
	
	
	public static void captureScreenshot(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		//String path = "E:\\capturescreenshot\\"+filename+".png";
		//alternate way to define path
		String path=System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";
		
		File destination= new File(path);//calling this method in another class
		FileHandler.copy(source, destination);
	}
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://zoom.us/signup");
	TakesScreenshot scrshot=(TakesScreenshot)driver;
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	String path = "E:\\capturescreenshot\\zoomscreenshot.png";
	File destination= new File(path);
	FileHandler.copy(source, destination);//1st program in which we create a folder in E drive
			
}
}
