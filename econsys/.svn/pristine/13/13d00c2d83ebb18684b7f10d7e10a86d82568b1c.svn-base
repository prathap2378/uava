package adminpage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.CreatePageUi;
import com.UIobjectrepositary.in.SadminUi;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class PageCreation extends Driver  {
	
	SadminUi sa=PageFactory.initElements(Driver.driver(), SadminUi.class);
	CreatePageUi page=PageFactory.initElements(Driver.driver(), CreatePageUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	
	
	//Log details
		private static Logger log = Logger.getLogger(CreateOrg.class.getName());
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  	String Home=PropertiesUtil.getPropValues("Phome");
		String NewRTQ=PropertiesUtil.getPropValues("Prtq");
		String Admin=PropertiesUtil.getPropValues("Padmin");
		String Savedrtq=PropertiesUtil.getPropValues("Psrtq");
		String Autoapprova=PropertiesUtil.getPropValues("pautoapproval");
		String Businessrules=PropertiesUtil.getPropValues("Pbusinessrules");
		String Processstage=PropertiesUtil.getPropValues("Pprocessstage");
		String Userlist=PropertiesUtil.getPropValues("Puserlist");
		String Prodocs=PropertiesUtil.getPropValues("Pprojectdocs");
		String Processview=PropertiesUtil.getPropValues("Pprocessview");
		String Gridmaster=PropertiesUtil.getPropValues("Pgridmas");
		String Setings=PropertiesUtil.getPropValues("Psetings");
		String ProArchive=PropertiesUtil.getPropValues("Pproarch");
		String EXe=PropertiesUtil.getPropValues("Pexe");
		String GTM=PropertiesUtil.getPropValues("pgtm");
		String Madmin=PropertiesUtil.getPropValues("Pmadmin");
		String Quotesubmitstatus=PropertiesUtil.getPropValues("Pqss");
		String Signin=PropertiesUtil.getPropValues("Psignin");
		String MR=PropertiesUtil.getPropValues("Pmreview");
		String editprofile=PropertiesUtil.getPropValues("Peditprofile");
				
	  cu.waitForPageToLoad();
	  Workbook wb=new Workbook();
		String Orgname=wb.getXLData(32, 0, 0);
	  sa.getMysites().click();
		log.info("Checking for the the org in my sitees liferay");
		
		Thread.sleep(1000);
		driver().findElement(By.xpath("//span[contains(text(),'"+Orgname+"')]")).click();
		log.info("selected newly created org");
		
		sa.getAdminliferay().click();
		log.info("Click on admin again");
		
		sa.getPages().click();
		log.info("get into add pages");
		
		page.getPublicpages().click();
		
		page.getBluetheme().click();
		System.out.println("************************");
		
		
		//Adding home page
		page.getAddpage().click();
		log.info("Adding page");
		page.getPagenameEnter().sendKeys(Home);
		log.info("Page name entered"+Home);
		page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page********************"+Home);
		
		//Adding RTQ page
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(NewRTQ);
		log.info("Page name entered="+NewRTQ);
		page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page****************"+NewRTQ);
		
		//Adding Admin page				
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(Admin);
		log.info("Page name entered="+Admin);
		page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page*****************"+Admin);
		
		driver().findElement(By.xpath("//a[contains(text(),'"+Admin+"')]")).click();
		
		//Adding Save RTQ page
	 	page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Savedrtq);
	 	log.info("Page name entered="+Savedrtq);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page"+Savedrtq);
		
		//Adin Autoapproval page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Autoapprova);
	 	log.info("Page name entered="+Autoapprova);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page******************"+Autoapprova);
		
		//Adding Business rules page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Businessrules);
	 	log.info("Page name entered="+Businessrules);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page"+Businessrules);
		
		//Adding Process Stage page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Processstage);
	 	log.info("Page name entered="+Processstage);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page**************"+Processstage);
		
		//Adding User list page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Userlist);
	 	log.info("Page name entered="+Userlist);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page****************"+Userlist);
		
		//Adding Project docs page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Prodocs);
	 	log.info("Page name entered="+Prodocs);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page****************"+Prodocs);
		
		//Adding Process view
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Processview);
	 	log.info("Page name entered="+Processview);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page*******************"+Processview);
		
		//Adding Grid Masters page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Gridmaster);
	 	log.info("Page name entered="+Gridmaster);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page********************"+Gridmaster);
		
		//Adding Setings page
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Setings);
	 	log.info("Page name entered="+Setings);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page*******************"+Setings);
		page.getPublicpages().click();
		
		//Adding Project archive page
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(ProArchive);
		log.info("Page name entered="+ProArchive);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page********************"+ProArchive);
		
		//Adding Exe page
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(EXe);
		log.info("Page name entered="+EXe);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page*************************"+EXe);
		
		driver().findElement(By.xpath("//a[contains(text(),'"+EXe+"')]")).click();
		//Adding Status of submitted quote
		page.getAddchildpage().click();
	 	page.getPagenameEnter().sendKeys(Quotesubmitstatus);
	 	log.info("Page name entered="+Quotesubmitstatus);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page***********************"+Quotesubmitstatus);
		page.getPublicpages().click();
		
		//Adding Monorail admin page
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(Madmin);
		log.info("Page name entered="+Madmin);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page*************************"+Madmin);
		
		//Adding Sign in page
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(Signin);
		log.info("Page name entered="+Signin);
	 	page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page************************"+Signin);
		
		//Adding Monthly review
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(MR);
		log.info("Page name Entered="+MR);
		page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page************************"+MR);
		
		//Ading edit profile page
		page.getAddpage().click();
		page.getPagenameEnter().sendKeys(editprofile);
		log.info("Page name Entered="+editprofile);
		page.getSinglecolumnradio().click();
		page.getAddpagebutton().click();
		log.info("Saved the page************************"+editprofile);
		
		
		/*Thread.sleep(1000);
		driver().findElement(By.xpath("//a[contains(text(),'"+NewRTQ+"')]")).click();
		 * WebElement permissions=page.getPermissions();
		 * permissions.click();
		 * driver().switchTo().window("Permissions");
		page.getGuestviewcheckbox().click();
		page.getSitememberviewcheckbox().click();
					page.getPowerusercheckbox().click();
	*/				
		
		
  }
}
