package first;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static void main() {
		
		ExtentSparkReporter Reporter;
		ExtentReports Report;
		ExtentTest Test;
	
		 Reporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/Extent/Report.html");
		 Reporter.config().setDocumentTitle("Instagram");
		 Reporter.config().setReportName("Instagram Reports");
		Reporter.config().setTheme(Theme.STANDARD)	;
	
		Report=new ExtentReports();
		Report.attachReporter(Reporter);
		Report.setSystemInfo("url", "www.Instagram.com");
		Report.setSystemInfo("Reporter-Name", "Bhasha");
		Report.setSystemInfo("platform", "window");
		
		Test=Report.createTest("Create Report");
		Test.log(Status.PASS, "Test passes");
		
		Report.flush();
	
}}
	

