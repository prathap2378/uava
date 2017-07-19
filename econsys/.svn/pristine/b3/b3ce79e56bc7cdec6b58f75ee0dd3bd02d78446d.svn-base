package adminpage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.*;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class ReviewInvolve extends Driver {
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	EngReviewInvoveUi eri=PageFactory.initElements(Driver.driver(), EngReviewInvoveUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CommercialReviewInvolve cri=PageFactory.initElements(Driver.driver(), CommercialReviewInvolve.class);
	
	static Workbook wb=new Workbook();
	static Login login=new Login();
	static ReviewInvolve ri=new ReviewInvolve();
	static Basic b=new Basic();
	
  @Test
  //*********Engg review********
  
 
  public void reviewEL() throws IOException, InterruptedException {
	  
      login.loginEL();	
      Thread.sleep(1000);
	  ab.getReviewinvolvetasks().click();
	  b.projectnamerevieinvolve();
	  Thread.sleep(1000);
	  cu.selectByVisibleText(eri.getReviewBuldingtype(), "Yes");
	  cu.selectByVisibleText(eri.getReviewEnduserindustrysector(), "Yes");
	  cu.selectByVisibleText(eri.getReviewProduct(), "Yes");
	  ab.getComments().sendKeys("Engg review");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  
  //************Engg involvement**********
  public void involveEL() throws IOException, InterruptedException{
	  
	  login.loginEL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().click(); 
	  b.projectnamerevieinvolve();
	  Thread.sleep(1000);
	  cu.selectByVisibleText(eri.getInvolveEndUserindustrysector(), "Yes");
	  cu.selectByVisibleText(eri.getInvolveBuldingtype(), "Yes");
	  cu.selectByVisibleText(eri.getInvolveProduct(), "Yes");
	  ab.getComments().sendKeys("Engg involve");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
  
  //**********Comm Review**************
  public void reviewCL() throws IOException, InterruptedException{
	 
	  login.loginCL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().click(); 
	  b.projectnamerevieinvolve();
	  Thread.sleep(1000);
	  cu.selectByVisibleText(cri.getrTermsandConditions(), "Yes");
	  cu.selectByVisibleText(cri.getrPerformanceBond(), "Yes");
	  cu.selectByVisibleText(cri.getrParentCompanyGuarantee(), "Yes");
	  ab.getComments().sendKeys("Comm review");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
  
  //*************Comm involve**********
  public void involveCL() throws IOException, InterruptedException{
	  
	  login.loginCL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().click();	 
	  b.projectnamerevieinvolve();
	  Thread.sleep(1000);
	  cu.selectByVisibleText(cri.getiTermsandConditions(), "Yes");
	  cu.selectByVisibleText(cri.getiPerformanceBond(), "Yes");
	  cu.selectByVisibleText(cri.getiParentCompanyGuarantee(), "Yes");
	  ab.getComments().sendKeys("Comm involve");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
  
  public void involveCLcp2cp3() throws IOException, InterruptedException{
	 
	  login.loginCL();
	  Thread.sleep(1000);
	  ab.getReviewinvolvetasks().click();	 
	  b.projectnamerevieinvolve();
	  Thread.sleep(1000);
	  cu.selectByVisibleText(cri.getiTermsandConditionscp2cp3(), "Yes");
	  cu.selectByVisibleText(cri.getiPerformanceBondcp2cp3(), "Yes");
	  cu.selectByVisibleText(cri.getiParentCompanyGuaranteecp2cp3(), "Yes");
	  ab.getComments().sendKeys("Comm involve CP2-CP3");
	  ab.getReviewInvolveapprovebutton().click();
	  
	  login.logout();
  }
}
