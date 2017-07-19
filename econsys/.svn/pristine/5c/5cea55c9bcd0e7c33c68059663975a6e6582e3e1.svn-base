package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;

public class RejectSmallWorks extends Driver{
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	//Imported class
	Login login = new Login();
	SmallWorks sw= new SmallWorks();
	Basic b = new Basic();
	Workbook wb = new Workbook();
	String projectName;
	String projectName1;
	Monorail m =new Monorail();
	submitQuote s= new submitQuote();
	{
	try {
		projectName=wb.getXLData(1,2,1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
  @Test
  public void cp2Reject() throws IOException, InterruptedException, AWTException {
	  
	  sw.quoteForm();
	  ab.getSubmitbutton().click();
	  login.logout();
	  login.loginboard();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  Thread.sleep(500);
	  ab.getComments().sendKeys("Reject this project at CP2");
	  ab.getRejectbutton().click();
	  login.logout();
	  login.user();
	  ab.getViewalltasks().click();
	  b.projectname();
	  Thread.sleep(500);
	  projectName1 = driver.findElement(By.xpath("//input[@id='st_ProjectName']")).getAttribute("value");
	  System.out.println(projectName1+"project Rejected at CP2");
	  Assert.assertEquals(projectName1, projectName);
  }
  public void cp3Reject() throws IOException, InterruptedException, AWTException{
	  sw.quoteForm();
	  ab.getSubmitbutton().click();
	  login.logout();
	  m.board();
	  s.testsubmitQuoteform();
	  m.statusQuotesubmit();
  }
  
}
