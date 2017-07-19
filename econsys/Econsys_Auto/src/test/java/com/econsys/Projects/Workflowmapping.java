package com.econsys.Projects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.UIobjectrepositary.*;

public class Workflowmapping {
  @Test
  
  public void f() throws InterruptedException {
	  
	  AdminUIlibrery al=PageFactory.initElements(Driver.driver(), AdminUIlibrery.class);
	  
	  Thread.sleep(2000);
	  
	  Thread.sleep(2000);
	  
	  
	  
	  //selecting orgnisation in UAT
	  //organisation.selectByVisibleText("Global Associates");
	  
	  
	  //select production organisations
	  /*
	  //test organisation
	  organisation.selectByVisibleText(" Global Associates");
	  //Global associates organisation live
	  organisation.selectByVisibleText(" GlobalAssociates");
	  //RCC limited organisation
	  organisation.selectByVisibleText(" RCClimited");*/
	  
	  
	  //al.getCancelbutton().click();
	  
	  
  }
}
