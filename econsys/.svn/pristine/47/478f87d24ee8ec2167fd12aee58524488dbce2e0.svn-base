package com.econsys.Projects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class Usercreation extends Driver{
	
	static SadminUi sa=PageFactory.initElements(Driver.driver(), SadminUi.class);
	static UsercreateUi us=PageFactory.initElements(Driver.driver(), UsercreateUi.class);
	static AdminUIlibrery ad=PageFactory.initElements(Driver.driver(), AdminUIlibrery.class);
	static CreatePageUi pc=PageFactory.initElements(Driver.driver(), CreatePageUi.class);
	static CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	private static Logger log = Logger.getLogger(Usercreation.class.getName());
	static Login login=new Login();
	static Workbook wb=new Workbook();
	
	//Variables
	static String filepath=System.getProperty("user.dir");
	
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
  public static void userCreation() throws IOException, InterruptedException {
		
		login.url();
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
		log.info("Creating user for the Org------"+Orgname);
		
		/*String XLpath=PropertiesUtil.getPropValues("Path_TestData");
		log.info("path"+XLpath);*/
		
		String xlpath = filepath+"//src//main//java//com//econsys//TestData//Monorail_testdata.xls";
		//File intilization
		FileInputStream file = new FileInputStream(xlpath);
		log.info("file "+file);
	  
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sheet = wb.getSheetAt(4);
		
		Iterator<Row> rows = sheet.rowIterator();
		
		while (rows.hasNext()) {
			Row row = rows.next();
			
			int rowNum = row.getRowNum();
			
			if(rowNum !=0){
				 
			   String screenName = row.getCell(0).getStringCellValue();
			   log.info("screenName+++++++++++"+screenName);
			   String email = row.getCell(1).getStringCellValue();
			   log.info("email+++++++++++"+email);
			   String firstName = row.getCell(2).getStringCellValue();
			   log.info("firstName+++++++++++"+firstName);
			   String lastName = row.getCell(3).getStringCellValue();
			   log.info("lastName+++++++++++"+lastName);
		
		/*HSSFWorkbook wb1 = new HSSFWorkbook(file);
	  
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
        log.info("row num "+rowNum);*/
        
   		/*if (rowNum !=0) {
          	String cell1Value = row.getCell(0).getStringCellValue();
          	log.info("cell1Value = "+cell1Value);
          	String cell2Value = row.getCell(1).getStringCellValue();
          	log.info("cell2Value = "+cell2Value);
           	String cell3Value = row.getCell(2).getStringCellValue();
           	log.info("cell3Value = "+cell3Value);
          	String cell4Value = row.getCell(3).getStringCellValue();
          	log.info("cell4Value = "+cell4Value);
        */
			//Add user
          	us.getAdduserlink().click();
          	/*pc.getAddorgbutton().click();
          	pc.getUser().click();*/
    		us.getScreennametextfield().sendKeys(screenName);
    		us.getEmailaddress().sendKeys(email);
    		us.getFirstname().sendKeys(firstName);
    		us.getLastname().sendKeys(lastName);
    		us.getUsersavebutton().click();
    		//Set password
    		System.out.println("user created");
    		driver.findElement(By.xpath("//a[@id='_125_passwordLink']")).click();
    		driver.findElement(By.xpath("//input[@id='_125_password1']")).sendKeys("test");
    		driver.findElement(By.xpath("//input[@id='_125_password2']")).sendKeys("test");
    		us.getUsersavebutton().click();
    		System.out.println("password is set");
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
