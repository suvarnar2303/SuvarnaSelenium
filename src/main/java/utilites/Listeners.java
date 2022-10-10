package utilites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener{
	 public ExtentReports test;
	public  ExtentTest logger;
	    public WebDriver driver;
	       

	public void onTestStart(ITestResult result) {
		ExtentReports test = ManageReport.Report(result.getMethod().getMethodName());
		 Reporter.log("all configuration is done test will run", true);
		
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "test case is pass");


	}

	public void onTestFailure(ITestResult result) {
		logger.fail(result.getThrowable());
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			logger.addScreenCaptureFromPath(Helper.captureScreenShot(driver));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("report is generated go and see in report folder");
	}

	public void onTestSkipped(ITestResult result) {
		logger.skip("test is skiped");
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		test.flush();
		
	}

}
