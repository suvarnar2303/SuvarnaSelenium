package utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ManageReport {
	public void Ok2()
	{
		go.click();
	}
     
	public static ExtentReports Report(String testCasename)
	{
		String path = System.getProperty("user.dir")+testCasename+"\\index.html";
		ExtentSparkReporter rep=new ExtentSparkReporter(path);
		rep.config().setDocumentTitle("Test result");
		rep.config().setReportName("WebAutomation testing");
		ExtentReports report=new ExtentReports();
	  report.attachReporter(rep);
	  report.setSystemInfo("Tester","ravi kiran");
	  return report;
	}
}
