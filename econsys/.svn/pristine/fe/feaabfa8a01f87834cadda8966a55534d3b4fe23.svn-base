package adminpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.SadminUi;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;

public class Porletassign extends Driver{
  @Test
  public void f() throws InterruptedException {
	  
	  Actions act = new Actions(driver());
	  
	  SadminUi sa=PageFactory.initElements(Driver.driver(), SadminUi.class);
	  CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	  
	  cu.waitForPageToLoad();
	  System.out.println("Wait");
	  
	  Thread.sleep(2000);
	  sa.getAddportletbutton().click();
	  //new WebDriverWait(driver(),60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='_145_addPanel']"))).click();
	  System.out.println("****");
	  /*WebElement sourcehomeportlet=sa.getRTQProcessInitiatorportlet();
	  System.out.println("get portlet");
	  sa.getHome().click();
	  System.out.println("click home");
	  WebElement DesHome=driver().findElement(By.xpath("//div[@id='content']"));
	  System.out.println("Drop portlet");
	  act.dragAndDrop(sourcehomeportlet, DesHome).build().perform();
	  System.out.println("Portlet droped");
*/  }
}
