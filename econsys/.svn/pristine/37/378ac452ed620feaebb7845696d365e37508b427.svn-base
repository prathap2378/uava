package com.econsys.pag;

import java.io.IOException;

import org.apache.commons.lang3.text.WordUtils;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Genriclibrery.EconsysVariables;
import com.econsys.Projects.Login;
import com.econsys.Projects.Monorail;
import com.econsys.UIobjectrepositary.ActionButtonsUi;
import com.econsys.UIobjectrepositary.Preparequote;

public class PAGFlow {
	public static Preparequote prepare_Quoteui = PageFactory.initElements(
			Driver.driver(), Preparequote.class);
	ActionButtonsUi ab = PageFactory.initElements(Driver.driver(),
			ActionButtonsUi.class);
	CommonUtils cu = new CommonUtils();
	Login login = new Login();
	EconsysVariables ev = new EconsysVariables();
	ProjectMethodsPAG promethods = new ProjectMethodsPAG();
	Monorail monorail = new Monorail();

	@Test
	public void pagFlow() throws InterruptedException, IOException {

		login.url();
		cu.waitForPageToLoad();
		// Add Lead form
		promethods.leadForm();
		// Qualify Lead
		promethods.qualifyLead();
		login.logout();

		// Prepare Quote
		monorail.prepare_Quote();
		cu.selectByVisibleText(
				prepare_Quoteui.getExpliciteapprovalatgateway2(), ev.exeCP2);
		// ----Estimation
		promethods.estimation();
		// ----Design calculation
		promethods.design();
		cu.blindWait();
		ab.getComments().sendKeys("Prepare Quote...");
		prepare_Quoteui.getQuoteprepared().click();
		login.logout();

		monorail.submitQuote();
	}
}
