package com.econsys.Genriclibrery;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.econsys.UIobjectrepositary.RtqFormUi;

public class Alerts extends Driver{
	RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	CommonUtils cu = new CommonUtils();
	Logger log = Logger.getLogger(Alerts.class.getName());
	//Duplicate file alert-A file with same name already exists in current context. Select different file
	@FindBy(xpath="//div/div[contains(text(),'A file with same name already exists in current context. Select different file')]")
	private WebElement file_DuplicateAlert;
	
	//Mandatory alert-Please fix the errors which are marked in red
	@FindBy(xpath="//div[contains(text(),'Please fix the errors which are marked in red')]")
	private WebElement fields_MandatoryAlert;
	
	//Accept alerts
	@FindBy(xpath="//div/a[contains(text(),'OK')]")
	private WebElement alert_Accept;

	public WebElement getFile_DuplicateAlert() {
		return file_DuplicateAlert;
	}

	public WebElement getFields_MandatoryAlert() {
		return fields_MandatoryAlert;
	}

	public WebElement getAlert_Accept() {
		return alert_Accept;
	}
	
	
	public void alertspresent() throws InterruptedException{
		//cu.WaitForElementXPATHPresent("//div[contains(text(),'Please fix the errors which are marked in red')]");
	    //cu.WaitForElementXPATHPresent("//div/div[contains(text(),'A file with same name already exists in current context. Select different file')]");
		/*boolean projectname = nrtq.getProjectName().getAttribute("value").isEmpty();
		boolean address = nrtq.getProjectAddres().getAttribute("value").isEmpty();
		 log.info("address :"+address+" projectname "+projectname);
		if(address){
			log.info("Madatory error");
			Thread.sleep(500);
			Driver.driver().findElement(By.xpath("//div/a[contains(text(),'OK')]")).click();
	    	log.info("Mandatory alert accepted");
		}*/
		
		WebElement uploadContainer = driver.findElement(By.xpath("//div[@id='upload-container']"));
		int files_Size = uploadContainer.findElements(By.xpath(".//*")).size();
		log.info("files_Size**********: "+files_Size);
		if(files_Size<1){
			log.info("Madatory error ************file size");
			Thread.sleep(500);
			Driver.driver().findElement(By.xpath("//div/a[contains(text(),'OK')]")).click();
	    	log.info("Mandatory alert accepted*********");
		}
		else{
			log.info("No Madatory error ************file size");
		}
		
		log.info("In alert");
		int man = Driver.driver.findElements(By.xpath("//div/div[contains(text(),'A file with same name already exists in current context. Select different file')]")).size();
		log.info("man :"+man);
		cu.blindWait();
		int man1 = Driver.driver.findElements(By.xpath("//div[contains(text(),'Please fix the errors which are marked in red')]")).size();
		log.info("man1 :"+man1);
		if(man>0||man1>0){
	    	log.info("Madatory error");
	    	getAlert_Accept().click();
	    	log.info("Mandatory alert accepted");
	    }
		
	    /*if(man1>0){
	    	log.info("duplicate_filealert error");
	    	cu.blindWait();
	    	
	    	Driver.driver().findElement(By.xpath("//div/a[contains(text(),'OK')]")).click();
	    	
	    	log.info("Mandatory alert accepted");
	    }*/
	    else{
	    	log.info("out of alert");
	    }
	}
	
	public void isEmpty(){
		boolean projectname = nrtq.getProjectName().getAttribute("value").isEmpty();
	}
	public int upload_mdrProgDocument(){
		WebElement prog = driver.findElement(By.xpath("//div[@id='upload-mdrProgDocument']"));
		int upload_mdrProgDocument = prog.findElements(By.xpath(".//*")).size();
		return upload_mdrProgDocument;
	}
	public int upload_mdrMilestoneDocument(){
		WebElement mile = driver.findElement(By.xpath("//div[@id='upload-mdrMilestoneDocument']"));
		int upload_mdrMilestoneDocument = mile.findElements(By.xpath(".//*")).size();
		log.info(""+upload_mdrMilestoneDocument);
		return upload_mdrMilestoneDocument;
	}
	public int upload_mdrPanelProductionSchedule(){
		WebElement panel = driver.findElement(By.xpath("//div[@id='upload-mdrPanelProductionSchedule']"));
		int upload_mdrPanelProductionSchedule = panel.findElements(By.xpath(".//*")).size();
		log.info(""+upload_mdrPanelProductionSchedule);
		return upload_mdrPanelProductionSchedule;
	}
public void deliveryReview(){
System.out.println("delivery review");	
}
}
