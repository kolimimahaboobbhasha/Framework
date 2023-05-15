package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test start");
		}
	

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
		}

	public void onTestFailure(ITestResult result) {System.out.println("Test failure");}

	public void onTestSkipped(ITestResult result) {System.out.println("Test skip");}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
		

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {System.out.println("on test");}

	public void onFinish(ITestContext context) {System.out.println("Test finish");}}
