package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.Login;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;

public class QuoteFormActions extends Driver{
	
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);	
	SmallWorks smallworks = new SmallWorks();
	Workbook wb = new Workbook();
	Login login = new Login();
	
	Object projectName;
	Object projectName1;
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		QuoteFormActions q = new QuoteFormActions();
		q.save();
		q.reset();
	}
  @Test
  
  public void reset() throws IOException, InterruptedException, AWTException{
	  projectName=wb.getXLData(1,2,1);
	  /*String url=wb.getXLData(1, 3, 0);
		String userName=wb.getXLData(1,0, 0);
		String password=wb.getXLData(1, 1, 0);
	  login.url(url);
		cu.waitForPageToLoad();
		login.user(userName,password);*/
		
	  smallworks.quoteForm();
	  ab.getResetButton().click();
	  Thread.sleep(500);
	  String resetalert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//div[7]/div[2]/a[2]")).click();
	  Thread.sleep(500);
	  Assert.assertEquals(" "," ");
	  System.out.println(resetalert);
  }
  public void save() throws IOException, InterruptedException, AWTException {
	  projectName=wb.getXLData(1,2,1);
	  System.out.println(projectName);
	  smallworks.quoteForm();
	  ab.getSavebutton().click();
	  /*String url=wb.getXLData(1, 3, 0);
		String userName=wb.getXLData(1,0, 0);
		String password=wb.getXLData(1, 1, 0);
	  login.url(url);
		cu.waitForPageToLoad();
		login.user(userName,password);*/
		
	  ab.getSavedRTQ().click();
	  System.out.println("open project");
	  driver.findElement(By.xpath("//tr[td[@title='"+projectName+"']]/td[9]/a[text()='Edit']")).click();
	  Thread.sleep(500);
	  projectName1 = driver.findElement(By.xpath("//input[@id='st_ProjectName']")).getAttribute("value");
	  Thread.sleep(1000);
//	  String customer = driver.findElement(By.xpath("//input[@id='st_Customer']")).getAttribute("value");
	  Assert.assertEquals(projectName,projectName1);
	  Assert.assertEquals(projectName1, projectName);
	  System.out.println("after"+projectName1);
	  login.logout();
	  //driver.close();
  }
}
