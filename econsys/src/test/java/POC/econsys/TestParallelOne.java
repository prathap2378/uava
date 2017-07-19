package POC.econsys;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestParallelOne {
	
	Logger log = Logger.getLogger(TestParallelOne.class.getName());
	@Test
	public void testCaseOne() {
		//Printing Id of the thread on using which test method got executed
		
		log.info("Test Case One with Thread Id:-**************** "
				+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        new ChromeDriver();
	}
	@Test
	public void testCaseTwo() {
		////Printing Id of the thread on using which test method got executed
		
		log.info("Test Case two with Thread Id:-**************** "
				+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        new ChromeDriver();
	}
}
