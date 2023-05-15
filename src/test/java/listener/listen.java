package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listen implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result)   {
	String method=	result.getMethod().getMethodName();
	test=report.createTest(method);
	}

	public void onTestSuccess(ITestResult result) {
		String method=	result.getMethod().getMethodName();
		test.log(Status.PASS,method+"success");
		
	}
	

	public void onTestFailure(ITestResult result) {
			String method=	result.getMethod().getMethodName();
			test.log(Status.FAIL, method+"failure");
			test.log(Status.FAIL, result.getThrowable());
			
	}

	public void onTestSkipped(ITestResult result) {
		String method=	result.getMethod().getMethodName();
		test.log(Status.SKIP, "skip");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("sucess percentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("timeout");
	}

	public void onStart(ITestContext context) {
	ExtentSparkReporter htmlreport= new ExtentSparkReporter("D:\\Testing\\first\\Extent Report4"+".html");
	htmlreport.config().setDocumentTitle("Basha tested");
	htmlreport.config().setTheme(Theme.STANDARD);
	htmlreport.config().setReportName("Basha");
	
	report=new ExtentReports();
	report.setSystemInfo("base-browser", "chrome");
	report.setSystemInfo("base-window", "window11");
	report.setSystemInfo("theme", "standard");
		
System.out.println("on start");
	
	}

	public void onFinish(ITestContext context) {
		report.flush();
	}

}
