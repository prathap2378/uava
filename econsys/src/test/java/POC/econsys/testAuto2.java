package POC.econsys;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;






import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
//import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.Login;
import com.econsys.UIobjectrepositary.LoginPageui;
public class testAuto2 {
	
		private static Logger log=Logger.getLogger(testAuto2.class.getName());
		//  private SoftAssert softAssert = new SoftAssert();
		LoginPageui loginUi=PageFactory.initElements(Driver.driver(), LoginPageui.class); 
		  Login login=new Login();
		 // LoginPageui loginUi= new LoginPageui();
		  CommonUtils cu= new CommonUtils();
	
	/*public void test2() throws IOException, InterruptedException{
		
		boolean flag=false;
		
		login.loginSL();
		flag=Driver.driver().findElement(By.xpath("//span[text()=' RTQ']")).isDisplayed();
		softAssert.assertEquals(flag, true);
		log.info("Test script executed successfully");
		
	}*/
		  @Test
	public void testInvalidlogin() throws IOException{
		//login.url();	  
		loginUi.getLoginName().sendKeys("test");
		loginUi.getPasword().sendKeys("test");
		loginUi.getLoginButton().click();
		cu.waitForPageToLoad();
		System.out.println("Validation Message ..."+loginUi.getLoginFailedMsg().getText());
		Assert.assertTrue(loginUi.getLoginFailedMsg().isDisplayed());
		log.info("Invalid Credentials are not accepted, Test Passed....");
	}
	}


