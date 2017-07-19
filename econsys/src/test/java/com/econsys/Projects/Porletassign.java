package com.econsys.Projects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.UIobjectrepositary.SadminUi;

public class Porletassign extends Driver{
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  Actions act = new Actions(driver());
	  Login login=new Login();
	  SadminUi sa=PageFactory.initElements(Driver.driver(), SadminUi.class);
	  CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	  
	  cu.waitForPageToLoad();
	  System.out.println("Wait");
	  login.url();
	  login.user();
	  Thread.sleep(2000);
	  driver().findElement(By.xpath("//span[contains(.,' My Opportunities')]")).click();
	  sa.getAddportletbutton().click();
	  new WebDriverWait(driver(),60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='_145_addPanel']"))).click();
	  System.out.println("****");
	  WebElement sourcehomeportlet=sa.getDelegateRTQ_Protelt();
	  Thread.sleep(2000);
	  System.out.println("get portlet");
	 // sa.getHome().click();
	  Thread.sleep(2000);
	 // System.out.println("click home");
	 // WebElement DesHome=driver().findElement(By.xpath("//div[@id='content']"));
	  WebElement DesHome=driver().findElement(By.xpath("//div[@id='layout-column_column-1']"));
	
	  System.out.println("Drop portlet");
	  act.dragAndDrop(sourcehomeportlet, DesHome).build().perform();
	  System.out.println("Portlet droped");
  }
}
