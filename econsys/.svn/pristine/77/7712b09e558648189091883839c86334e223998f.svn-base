package com.econsys.AllPages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.Login;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.LoginPageui;

public class LoginVerification extends Driver{
	private static Logger log=Logger.getLogger(LoginVerification.class.getName());
	Driver d = new Driver();
	LoginPageui loginUi=PageFactory.initElements(d.driver(), LoginPageui.class);
	
	  Login login=new Login();
	  Workbook wb = new Workbook();
	  CommonUtils cu= new CommonUtils();
	  
	  //UN authorized Login with user name
	  @Test
	  public void unAthorized_Login_userName() throws IOException, InterruptedException{

		String od=wb.getXLData(19,0, 0);
	  	loginUi.getLoginName().sendKeys(od);
	  	loginUi.getPasword().sendKeys("abc");
	  	loginUi.getLoginButton().click();
	  	Thread.sleep(1000);
	  	boolean username_isPresent = loginUi.getLoginName().isDisplayed();
	  	log.info(username_isPresent);
	  	/*String aleart = d.driver().findElement(By.xpath("//form[@id='_58_fm']/div")).getText();
	  	String expected1 = "Authentication failed. Please try again.";
	  	cu.assert_Test(expected1, aleart);*/
	  }
	  //UN authorized Login with user password
	  @Test(priority=1)
	  public void unAthorized_Login_userPassword() throws InterruptedException{
	  	
		cu.waitForPageToLoad();
	  	loginUi.getLoginName().sendKeys("monorail@gmail.com");
	  	loginUi.getPasword().sendKeys("test1");
	  	loginUi.getLoginButton().click();
	  	Thread.sleep(1000);
	  	boolean username_isPresent = loginUi.getLoginName().isDisplayed();
	  	log.info(username_isPresent);
	  	
	  }
	  //UN authorized Login with user name and password
	  @Test(priority=2)
	  public void unAthorized_Login_userNameANDpassword() throws IOException, InterruptedException{

		  loginUi.getLoginName().sendKeys("test");
			loginUi.getPasword().sendKeys("test");
			loginUi.getLoginButton().click();
			cu.waitForPageToLoad();
			cu.blindWait();
			boolean username_isPresent = loginUi.getLoginName().isDisplayed();
		  	log.info(username_isPresent);
		  	/*
			log.info("Validation Message ..."+loginUi.getLoginFailedMsg().getText());
			Assert.assertTrue(loginUi.getLoginFailedMsg().isDisplayed());
			log.info("Invalid Credentials are not accepted, Test Passed....");*/
		}
}
