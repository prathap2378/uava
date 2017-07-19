package adminpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.UIobjectrepositary.in.*;
import com.monorail.Genriclibrery.*;
import com.testdata.in.Workbook;

public class Usercreation extends Driver{
	
	SadminUi sa=PageFactory.initElements(Driver.driver(), SadminUi.class);
	UsercreateUi us=PageFactory.initElements(Driver.driver(), UsercreateUi.class);
	AdminUIlibrery ad=PageFactory.initElements(Driver.driver(), AdminUIlibrery.class);
	CreatePageUi pc=PageFactory.initElements(Driver.driver(), CreatePageUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	private static Logger log = Logger.getLogger(Usercreation.class.getName());
	Login login=new Login();
	Workbook wb=new Workbook();
	
	//Variables
	String filepath=System.getProperty("user.dir");
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Usercreation user=new Usercreation();
		user.userCreation();
	}
	
/*	@BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException {
		String url=wb.getXLData(1, 3, 0);
		login.url(url);
		cu.waitForPageToLoad();
		login.loginsuperadmin16();
		cu.waitForPageToLoad();
		  sa.getAdminliferay().click();
		  sa.getControlpanel().click();
		  
	  }*/
	
	
	@Test
  public void userCreation() throws IOException, InterruptedException {
		
		String url=wb.getXLData(1,3,0);
		login.url(url);
		cu.waitForPageToLoad();
		login.loginsuperadminTestServer();
		cu.waitForPageToLoad();
		sa.getAdminliferay().click();
	    sa.getControlpanel().click();
		cu.waitForPageToLoad();
		
		pc.getUsrsandOrgstab().click();
		//Getting Org name
		String Orgname=wb.getXLData(32,0,0);
		pc.getUsrsandOrgstab().click();
		log.info("creating users");
		
		pc.getAllorgs().click();
		driver().findElement(By.xpath("//a[contains(text(),'"+Orgname+"')]")).click();
		log.info("Creating user for the Org"+Orgname);
		
		/*String XLpath=PropertiesUtil.getPropValues("Path_TestData");
		log.info("path"+XLpath);*/
		
		String xlpath=filepath+"//src//com//testdata//in//Monorail_testdata.xls";
		//File intilization
		FileInputStream file = new FileInputStream(xlpath);
		log.info("file "+file);
	  
		HSSFWorkbook wb1 = new HSSFWorkbook(file);
	  
		log.info("Wb "+wb1);
	  
		int sheetnum=3;
	  
		HSSFSheet Firstpage=wb1.getSheetAt(sheetnum);
		log.info("page "+Firstpage);
		Iterator rowIterator = Firstpage.rowIterator();	
		
		while(rowIterator.hasNext()){
      	log.info("hasnext iterator");
		HSSFRow row = (HSSFRow) rowIterator.next();
      	log.info("next iterator");
		int rowNum = row.getRowNum();
        log.info("row num "+rowNum);
        
   		if (rowNum !=0) {
          	String cell1Value = row.getCell(0).getStringCellValue();
          	log.info("cell1Value = "+cell1Value);
          	String cell2Value = row.getCell(1).getStringCellValue();
          	log.info("cell2Value = "+cell2Value);
           	String cell3Value = row.getCell(2).getStringCellValue();
           	log.info("cell3Value = "+cell3Value);
          	String cell4Value = row.getCell(3).getStringCellValue();
          	log.info("cell4Value = "+cell4Value);
          	
          	us.getAdduserlink().click();
          	
          	/*pc.getAddorgbutton().click();
          	pc.getUser().click();*/
    		us.getScreennametextfield().sendKeys(cell2Value);
    		us.getEmailaddress().sendKeys(cell1Value);
    		us.getFirstname().sendKeys(cell3Value);
    		us.getLastname().sendKeys(cell4Value);
    		us.getUsersavebutton().click();
    		System.out.println("user created");
    		driver.findElement(By.xpath("//a[@id='_125_passwordLink']")).click();
    		driver.findElement(By.xpath("//input[@id='_125_password1']")).sendKeys("test");
    		driver.findElement(By.xpath("//input[@id='_125_password2']")).sendKeys("test");
    		us.getUsersavebutton().click();
    		System.out.println("password set");
    		us.getUsercancelbutton().click();
    		pc.getAllorgs().click();
    		driver().findElement(By.xpath("//a[contains(text(),'"+Orgname+"')]")).click();
    		
          }
		}
	}

@AfterMethod
  public void afterMethod() {
	  
  }

}
