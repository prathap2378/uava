package POC.econsys;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.Login;
import com.econsys.TestData.Workbook;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class superTestNG extends Driver{
	private static Logger log=Logger.getLogger(superTestNG.class.getName());
    Workbook wb = new Workbook();
    Login login=new Login();
    ExtentReports exReports;
	ExtentTest logger;
	@BeforeClass
	public void beforeTest(){
		log.info("You are into beforeTest() method....");
		exReports=new ExtentReports("C:\\Report\\EconsysReport.html", false);
		logger=exReports.startTest("Econsys Test Suite");
		
	}
	
	@AfterClass
	public void afterTest(){
		//Driver.driver().quit();
		log.info("You are into afterTest() method....");
		exReports.endTest(logger);
	}
}
