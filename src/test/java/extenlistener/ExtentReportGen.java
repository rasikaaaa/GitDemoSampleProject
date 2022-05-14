package extenlistener;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	 static ExtentReports extent;
	
	
public static ExtentReports extendReportGenerator()
{
	String path = System.getProperty("user.dir")+"//report//kitereport.html";

	         ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
         
         reporter.config().setTheme(Theme.DARK);
         
         reporter.config().setReportName("zerodha project");
         
         extent = new ExtentReports();
         
         extent.attachReporter(reporter);
         
         extent.setSystemInfo("project name", "kite zerodha");
         
         extent.setSystemInfo("envoirement", "SIT");
         
         extent.setSystemInfo("executed by", "15 jan batch");
         return extent;
}
}

