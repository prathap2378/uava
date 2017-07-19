package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.Basic;
import com.econsys.Projects.Login;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;

public class DonotProceed extends Driver{
	
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	Login login = new Login();
	Basic b = new Basic();
	Workbook wb= new Workbook();
	SmallWorks sw = new SmallWorks();
	String projectName;
	{
	try {
		projectName=wb.getXLData(1,2,1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
@Test
public void CP2donotproceed() throws IOException, InterruptedException, AWTException {
	  DonotProceed donotproceed = new DonotProceed();  
	  System.out.println("Project name = "+projectName);
	  /*sw.quoteForm();
	  ab.getSubmitbutton().click();*/
	  //login.logout();
	  login.url();
	  login.loginboard();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Delete this project CP2");
	  ab.getDonotproccedbutton().click();
	  String allert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  Thread.sleep(1000);
	  ab.getDonotproceed_allret_Ok().click();
	  System.out.println(allert+"project deleted");
	  donotproceed.search();
  }
	
  public void CP3donotproceed() throws IOException, InterruptedException, AWTException {
	  
  }
  public void CP4donotproceed() throws IOException, InterruptedException, AWTException {
	  sw.quoteForm();
  }
  public void CP5donotproceed() throws IOException, InterruptedException, AWTException {
	  sw.quoteForm();
  }
  public void search() throws InterruptedException{
	//Project archive action
	  Thread.sleep(500);
	  ab.getProject_Archive().click();
	  ab.getSearch().click();
	  Thread.sleep(500);
	  ab.getSearchProjectname().sendKeys(projectName);
	  Thread.sleep(500);
	  ab.getFind().click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//tr[td[span[@title='"+projectName+"']]]//td[12]/a[text()='Details']")).click();
	  Thread.sleep(500);
	  String projectName1=driver.findElement(By.xpath("//table[@id='rtqProjectInfoTable']/tbody/tr[2]/td[2]/label")).getText();
	  System.out.println(projectName1+"project do not proceed at CP2");
	  Assert.assertEquals(projectName1, projectName);
  }
}
