package com.econsys.Projects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class ReviewInvolve extends Driver {
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	EngReviewInvoveUi eri=PageFactory.initElements(Driver.driver(), EngReviewInvoveUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CommercialReviewInvolve cri=PageFactory.initElements(Driver.driver(), CommercialReviewInvolve.class);
	
	static Workbook wb=new Workbook();
	static Login login=new Login();
	static ReviewInvolve ri=new ReviewInvolve();
	static Basic b=new Basic();
	
  //@Test
  //*********Engg review********
  
 
  public void reviewEL() throws IOException, InterruptedException {
	  
      login.loginEL();
      cu.waitForPageToLoad();
	  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);
	  b.projectname_ReviewApproval();
	  Thread.sleep(1000);
	  /*cu.selectByVisibleText(eri.getReviewProjectType(), "Yes");
	  cu.selectByVisibleText(eri.getReviewBuldingtype(), "Yes");
	  cu.selectByVisibleText(eri.getReviewEnduserindustrysector(), "Yes");
	  cu.selectByVisibleText(eri.getReviewProduct(), "Yes");*/
	  select_Dropdowns();
	  ab.getComments().sendKeys("Engg review");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  
  //************Engg involvement**********
  @Test
  public void involveEL() throws IOException, InterruptedException{
	  login.url();
	  login.loginEL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN); 
	  b.projectname_ReviewApproval();
	  Thread.sleep(1000);
	  /*cu.selectByVisibleText(eri.getInvolveEndUserindustrysector(), "Yes");
	  cu.selectByVisibleText(eri.getInvolveBuldingtype(), "Yes");
	  cu.selectByVisibleText(eri.getInvolveProduct(), "Yes");
	  cu.selectByVisibleText(eri.getInvolveProjectType(), "Yes");*/
	  select_Dropdowns();
	  ab.getComments().sendKeys("Engg involve");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  
  //**********Comm and Engineering select drop downs**************
  public void select_Dropdowns(){
	  List<WebElement> SelectOptions=driver.findElements(By.xpath("//td[@class='rtqChekBoxlabel']/following-sibling::td/select"));
	  for(int i=0;i<SelectOptions.size();i++){
		  WebElement selectElement=SelectOptions.get(i);
		  cu.selectByVisibleText(selectElement, "Yes");
	  }
  }
  public void reviewCL() throws IOException, InterruptedException{
	  login.loginCL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN); 
	  b.projectname_ReviewApproval();
	  Thread.sleep(1000);
	 /* cu.selectByVisibleText(cri.getrTermsandConditions(), "Yes");
	  cu.selectByVisibleText(cri.getrPerformanceBond(), "Yes");
	  cu.selectByVisibleText(cri.getrParentCompanyGuarantee(), "Yes");*/
	  select_Dropdowns();
	  ab.getComments().sendKeys("Comm review");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
  
  //*************Comm involve**********
  public void involveCL() throws IOException, InterruptedException{
	  
	  login.loginCL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);	 
	  b.projectname_ReviewApproval();
	  Thread.sleep(1000);
	  /*cu.selectByVisibleText(cri.getiTermsandConditions(), "Yes");
	  cu.selectByVisibleText(cri.getiPerformanceBond(), "Yes");
	  cu.selectByVisibleText(cri.getiParentCompanyGuarantee(), "Yes");*/
	  select_Dropdowns();
	  ab.getComments().sendKeys("Comm involve");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
  
  public void involveCLcp2cp3() throws IOException, InterruptedException{
	 
	  login.loginCL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);	 
	  b.projectname_ReviewApproval();
	  Thread.sleep(1000);
	  /*cu.selectByVisibleText(cri.getiTermsandConditionscp2cp3(), "Yes");
	  cu.selectByVisibleText(cri.getiPerformanceBondcp2cp3(), "Yes");
	  cu.selectByVisibleText(cri.getiParentCompanyGuaranteecp2cp3(), "Yes");*/
	  select_Dropdowns();
	  ab.getComments().sendKeys("Comm involve CP2-CP3");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
}
