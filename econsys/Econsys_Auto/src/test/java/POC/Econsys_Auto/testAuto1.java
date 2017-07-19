package POC.Econsys_Auto;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.econsys.Genriclibrery.Driver;

//import com.econsys.Genriclibrery.Driver;

public class testAuto1 {
	private static Logger log=Logger.getLogger(testAuto1.class.getName());
	
@Test()
public void test1()throws Exception{
	
	boolean flag=false;
	flag=Driver.driver().findElement(By.xpath("//span[text()=' RTQ']")).isDisplayed();
	Assert.assertEquals(flag, true);
	log.info("Test script executed successfully");
	
}
}
