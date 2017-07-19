package com.econsys.Listeners;



import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.econsys.Genriclibrery.CommonUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterNG implements IReporter{
	private ExtentReports extent;
	  CommonUtils cu=new CommonUtils();
 
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        extent = new ExtentReports(outputDirectory + File.separator + "ExtentReportTestNG.html", true);
  
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
  
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
  
                buildTestNodes(context.getPassedTests(), LogStatus.PASS);
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
            }
        }
  
        extent.flush();
        extent.close();
    }
  
    private void buildTestNodes(IResultMap tests, LogStatus status) {
        ExtentTest test;
        String dir =System.getProperty("user.dir");
        System.out.println("bhanu" + dir);
        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.startTest(result.getMethod().getMethodName());
  
              /*  test.getTest().startedTime = getTime(result.getStartMillis());
                test.getTest().endedTime = getTime(result.getEndMillis());*/
                test.getTest().getStartedTime();
                test.getTest().getEndedTime();
  
                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
  
                String message = "Test " + status.toString().toLowerCase() + "ed";
  
                if (result.getThrowable() != null)
                    message = result.getThrowable().getMessage();
                if(result.isSuccess()==false){
                	test.log(LogStatus.FAIL,"Refer the screenshot below \n"+test.addScreenCapture(System.getProperty("user.dir")+"\\ScreenShots\\"+"FAIL_"+result.getTestClass().getName()+"__"+result.getName().toString().trim()+".png"));
                	
                }
                test.log(status, message);
                
                extent.endTest(test);
            }
        }
    }
  
   /* private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();        
    }*/

	
}
