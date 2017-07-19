package POC.Econsys_Auto;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Genriclibrery.mailReport;
import com.econsys.Projects.Login;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Listener  implements ITestListener,ISuiteListener,IInvokedMethodListener{
 
	private static Logger log=Logger.getLogger(Listener.class.getName());
	Login login=new Login();
	CommonUtils cu= new CommonUtils();
	mailReport mreport=new mailReport();
	ExtentReports exReports;
	ExtentTest logger;
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		log.info("This is before test suite....");
		try {
			//new Driver();
		
			login.url();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error("Unable to execute OnStart due to ...",e);
		}
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		log.info("Suite execution ended ....");
		//mreport.sendmailReport("kaveri.r@quadwave.com");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {

		log.info(result);
		log.info("Test has Passed");
		/*boolean elementPresent=Driver.driver().findElements(By.xpath("//span[@class='nav-item-label']/span")).size()>0;
		if(elementPresent)
		login.logout();
		
		else
			log.info("Test has not logged in to Application...");
		*/
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
			log.error("FAIL Test "+result.getName().toString().trim()+" was failed In "+result.getTestClass()+" class");
			log.error("This is the Exception thrown on test execution",result.getThrowable());
			String screenShotName_loc=System.getProperty("user.dir")+"\\ScreenShots\\"+"FAIL_"+result.getTestClass().getName()+"__"+result.getName().toString().trim();
			cu.screenShot(screenShotName_loc);
			
			/*boolean elementPresent=Driver.driver().findElements(By.xpath("//span[@class='nav-item-label']/span")).size()>0;
			if(elementPresent)
			login.logout();
			else
				log.info("Test has not logged in to Application...");*/
			}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
			log.info("Test has skipped...");
			/*boolean elementPresent=Driver.driver().findElements(By.xpath("//span[@class='nav-item-label']/span")).size()>0;
			if(elementPresent)
			login.logout();
			else
				log.info("Test has not logged in to Application...");*/	
			}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		
	}

}
