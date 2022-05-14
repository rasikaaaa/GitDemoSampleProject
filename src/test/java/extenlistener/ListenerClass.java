package extenlistener;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.Screenshot;



public class ListenerClass extends BaseTest implements ITestListener
{
    public static ExtentTest test;
	ExtentReports extent =ExtentReportGen.extendReportGenerator();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case started:"+result.getName());
		 test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case passed:"+result.getName());
		test.log(Status.PASS,"Test case is passed");
	}

	@Override 
	
	public void onTestFailure(ITestResult result) {
				System.out.println("Test Case failed:"+result.getName());
				test.fail(result.getThrowable());
		try {
			//Screenshot.captureScreenshot(driver,result.getName() );
		test.addScreenCaptureFromPath(Screenshot.captureScreenshotWithPath(driver,result.getName()),"Captured screenshot");
		} catch (IOException e) {
			System.out.println("Exception occured while taking screenshot");
			
		}
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case got skippped:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test started:"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test completed:"+context.getName());
	 extent.flush();
	}

}
