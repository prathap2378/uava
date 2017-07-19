package com.econsys.pag;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Genriclibrery.EconsysVariables;
import com.econsys.Projects.Basic;
import com.econsys.Projects.Login;
import com.econsys.Projects.PropertiesUtil;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.UIobjectrepositary.ActionButtonsUi;
import com.econsys.UIobjectrepositary.PAGEstimationDesignPageObjects;
import com.econsys.UIobjectrepositary.PAGPageObjects;
import com.econsys.UIobjectrepositary.Preparequote;

public class ProjectMethodsPAG extends Driver {

	PAGPageObjects pag = PageFactory.initElements(Driver.driver(),
			PAGPageObjects.class);
	PAGEstimationDesignPageObjects estdec = PageFactory.initElements(
			Driver.driver, PAGEstimationDesignPageObjects.class);
	ActionButtonsUi ab = PageFactory.initElements(Driver.driver(),
			ActionButtonsUi.class);
	public static Preparequote prepare_Quoteui = PageFactory.initElements(
			Driver.driver(), Preparequote.class);

	ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works();
	CommonUtils cu = new CommonUtils();
	Login login = new Login();
	Basic b = new Basic();
	EconsysVariables ev = new EconsysVariables();
	String filepath = System.getProperty("user.dir");

	public void leadForm() throws InterruptedException, IOException {

		login.user();
		driver.findElement(By.xpath("//a/span[text()=' Add Lead']")).click();
		cu.waitForPageToLoad();
		pag.getProjectName().sendKeys(ev.projectName());

		pag.getSiteAddress().sendKeys("pag address");
		cu.blindWait();
		pag.getEngg().sendKeys("PAG engg");

		pag.getRegulator().sendKeys("regulator pag");
		pag.getStEnquery().sendKeys("Enquiry");
		// date
		pag.getEnquiryDate().click();
		cu.blindWait();
		driver.findElement(
				By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(text(),'1')]"))
				.click();
		cu.selectByIndex(pag.getTypeofProject(), 1);
		pag.getRequestiedParties().sendKeys("Requested parties");
		cu.selectByIndex(pag.getSelectArea(), 3);
		cu.selectByIndex(pag.getStCAT(), 1);

		// Upload document and save
		driver.findElement(By.xpath("//div[@id='enquiryDocs-dropzone']"))
				.click();
		projectMethods_Small_Works.uploadFile("Logfails - Copy (20).txt");

		/*
		 * driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click
		 * ();
		 * driver.findElement(By.xpath("//input[@id='description']")).sendKeys
		 * ("Doc");
		 * driver.findElement(By.xpath("//input[@id='dt_dateRecieved']")
		 * ).click(); driver.findElement(By.xpath(
		 * "//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[6]/a")).click();
		 * cu.blindWait();
		 * driver.findElement(By.xpath("//div[@id='RTQGriddoc-dropzone']"
		 * )).click();
		 * projectMethods_Small_Works.uploadFile("Logfails - Copy (20).txt");
		 * cu.waitForPageToLoad();
		 * driver.findElement(By.xpath("//div/button[contains(text(),'Save')]"
		 * )).click();
		 */

		ab.getComments().sendKeys("Lead form...");
		ab.getSavebutton().click();
		cu.blindWait();
		driver.findElement(By.xpath("//div[2]/a[contains(text(),'OK')]"))
				.click();
		// login.logout();
	}

	public void qualifyLead() throws IOException, InterruptedException {

		// login.user();
		// b.projectname();
		cu.blindWait();
		driver.findElement(By.xpath("//*[@id='viewAllMyRequests']")).click();

		String actionbutton = "//td[@title=" + ev.projectName()
				+ "]//following-sibling::td/div/button";
		// String taskName = PropertiesUtil.getPropValues("ASL");
		cu.blindWait();
		cu.WaitForElementXPATHPresent(actionbutton);
		driver.findElement(By.xpath(actionbutton)).click();
		cu.blindWait();
		driver.findElement(
				By.xpath("//*[@id='action-items-div']/table/tbody/tr[2]/td/span"))
				.click();
		cu.blindWait();
		cu.selectByIndex(pag.getStPAG_Solution(), 1);
		cu.blindWait();

		cu.selectByIndex(pag.getSoil_IR(), 1);
		cu.selectByIndex(pag.getDesignResp(), 1);
		cu.selectByIndex(pag.getDesignCalculation(), 1);
		pag.getMaterialProposal().sendKeys("Material Proposal");
		// cu.selectByIndex(pag.getFwdtoEstimating(), 1);
		cu.selectByIndex(pag.getDeawingRecieved(), 1);
		cu.selectByIndex(pag.getStQuotingAs(), 1);
		cu.selectByIndex(pag.getRetentionAdvised(), 1);
		pag.getRetentionvalue().sendKeys("12");
		cu.selectByIndex(pag.getDiscountRequested(), 1);
		pag.getDiscountValue().sendKeys("12");

		ab.getComments().sendKeys("qualify lead...");
		driver.findElement(By.xpath("//input[@id='quotepreparedPAG']")).click();
	}

	public void estimation() throws IOException, InterruptedException {

		estdec.getEstimation_Comments().sendKeys("Estimation");
		estdec.getSubmit_for_Estimation().click();
		ab.getCancelbutton().click();
		// Estimation
		ab.getViewalltasks().click();
		String projectName = "//tr[td[@title='Estimation']][td[@title="
				+ ev.projectName()
				+ "]]//preceding-sibling::td/a[contains(text(),'Estimation')]";
		driver.findElement(By.xpath(projectName)).click();
		cu.blindWait();
		estdec.getEstimation_dropzone().click();
		projectMethods_Small_Works.uploadFile("Logfails - Copy (19).txt");
		cu.waitForPageToLoad();
		estdec.getEstimation_Comments().sendKeys("Submit estimation");
		// submit
		ab.getSubmitbutton().click();
		cu.blindWait();
		// prepare quote
		String taskName = PropertiesUtil.getPropValues("prepare_Quote");
		b.projectTaskName(taskName);
		estdec.getEstimation_Comments().sendKeys("Approve estimation");
		ab.getApprove_Button().click();
		// ab.getCancelbutton().click();
	}

	public void design() throws IOException, InterruptedException {
		// prepare quote
		String taskName = PropertiesUtil.getPropValues("prepare_Quote");
		// b.projectTaskName(taskName);

		estdec.getDesign_Comments().sendKeys("Design calculation");
		estdec.getSubmit_for_Design().click();
		// Design calculation
		ab.getCancelbutton().click();
		ab.getViewalltasks().click();
		String projectName = "//tr[td[@title='Design Calculations']][td[@title="
				+ ev.projectName()
				+ "]]//preceding-sibling::td/a[contains(text(),'Design Calculations')]";
		driver.findElement(By.xpath(projectName)).click();
		cu.blindWait();
		estdec.getDesign_Dropzone().click();
		projectMethods_Small_Works.uploadFile("2137_006.pdf");
		cu.blindWait();
		estdec.getDesign_Comments().sendKeys("Submit Design calculation");
		// submit design
		ab.getSubmitbutton().click();
		cu.blindWait();
		// Prepare quote
		b.projectTaskName(taskName);

		estdec.getDesign_Comments().sendKeys("Approve Design calculation");
		// ab.getApprove_Button().click();
		cu.blindWait();
		driver.findElement(
				By.xpath("//div[@id='dcAccordian']//input[@value='Approve']"))
				.click();
	}

	public void statusofSubmittedQuote() {

	}

	public void customerCommitmentLoiEmail() {

	}

	public void customerCommitmentPoSubco() {

	}

	public void pdp() {

	}

	public void projectComplition() {

	}

	public void projectCompleted() {

	}
}
