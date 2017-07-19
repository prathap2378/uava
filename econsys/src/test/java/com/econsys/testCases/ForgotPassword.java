package com.econsys.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.Login;
import com.econsys.UIobjectrepositary.LoginPageui;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class ForgotPassword extends Driver{
	Logger log = Logger.getLogger(ForgotPassword.class);
	LoginPageui loginUI = PageFactory.initElements(Driver.driver(), LoginPageui.class);
	Login login = new Login();
  
@Test
 public void forgotPassword() throws IOException {
	  
	login.url();
	boolean s = loginUI.getForgotPassword().isDisplayed();
	  if(s){
		  
		  loginUI.getLoginName().sendKeys("");
		  loginUI.getEmailAddress().clear();
		  loginUI.getEmailAddress().sendKeys("");
		  
		  //Handling captcha
		  String frameurl = "http://localhost/DecodeCaptcha/CaptchaDecoder.aspx?spec= spec=U5hh2S%2b3XwOZzsxCon%2bv7Ts7tVuEeBFqZ%2bsmxSwT6ua3hHfateH3MlZE3nD%2fSX1y";
		  HtmlUnitDriver unitdriver = new HtmlUnitDriver(BrowserVersion.CHROME);
		  unitdriver.get(frameurl);
		  
		  String captchavalue = unitdriver.findElement(By.xpath("html/body")).getText();
		  loginUI.getCaptchaText().sendKeys(captchavalue);
	  }
	  else{
		  log.info("Not able to locate forgot password link");
	  }
  }
}
