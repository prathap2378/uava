package com.econsys.Projects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.*;
import com.econsys.TestData.*;

public class Login extends Driver {
	
	private static Logger log = Logger.getLogger(Login.class.getName());
	Workbook wb=new Workbook();
	LoginPageui loginui=PageFactory.initElements(Driver.driver(), LoginPageui.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	String sd=null;
	String psw=null;
	String bor=null;
	String cl=null;
	String el=null;
	String sl=null;
	String pl=null;
	String od=null;
	String sa;
	String userName;
	String password;
  
public void user()throws IOException, InterruptedException {
	  //(String un,String pwd)
	  cu.waitForPageToLoad();
	  userName = wb.getXLData(1, 0,0);
	  loginui.getLoginName().sendKeys(userName);
	  //log.info("login as user:"+un+"");
	  password = wb.getXLData(1, 1, 0);
	  loginui.getPasword().sendKeys(password);
	  loginui.getLoginButton().click();
}
public void url() throws IOException {
	  //String url
	  String workingURL = wb.getXLData(1,3,0);
	  driver().get(workingURL);
	  driver().manage().window().maximize();
	  //driver.navigate().refresh();
}
//Logout method
public void logout() throws InterruptedException{
	 Thread.sleep(1000);
	 //New theme logout link
	 Actions action=new Actions(Driver.driver());
	 action.moveToElement( driver.findElement(By.xpath("//span[@class='nav-item-label']/span"))).build().perform();
	 Thread.sleep(1000);
	 //driver.findElement(By.xpath("//span[@class='nav-item-label']/span")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
	 
	 //OLD theme logout link
	 //loginui.getLogout().click();
}
//Login super admin
public void loginsuperadminTestServer() throws IOException, InterruptedException{
	 cu.waitForPageToLoad();
	 sa=wb.getXLData(28, 0, 0);
	 psw=wb.getXLData(28,1, 0);
	 loginui.getLoginName().sendKeys(sa);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
 //CL login details
 public void loginCL() throws IOException, InterruptedException{
	// Login login=new Login();
	 cu.waitForPageToLoad();
	 cl=wb.getXLData(16, 0, 0);
	 psw=wb.getXLData(16,1, 0);
	 loginui.getLoginName().sendKeys(cl);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();

}
//EL login details
public void loginEL() throws IOException, InterruptedException{
	 cu.waitForPageToLoad();
	 el=wb.getXLData(13, 0, 0);
	 psw=wb.getXLData(13,1, 0);
	 loginui.getLoginName().sendKeys(el);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
//Board login details
public void loginboard() throws IOException, InterruptedException{
	 cu.waitForPageToLoad();
	 bor=wb.getXLData(4, 0, 0);
	 psw=wb.getXLData(4,1, 0);
	 loginui.getLoginName().sendKeys(bor);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
//SL login details
public void loginSL() throws IOException, InterruptedException{
	 cu.waitForPageToLoad();
	 sl=wb.getXLData(10, 0, 0);
	 psw=wb.getXLData(10,1, 0);
	 loginui.getLoginName().sendKeys(sl);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
//SD login details
public void loginSD() throws IOException, InterruptedException{
	 cu.waitForPageToLoad();
	 sd=wb.getXLData(7, 0, 0);
	 psw=wb.getXLData(7, 1, 0);
	 loginui.getLoginName().sendKeys(sd);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
//PL login details
public void loginPL() throws IOException, InterruptedException{
	 cu.waitForPageToLoad();
	 pl=wb.getXLData(22,0, 0);
	 psw=wb.getXLData(22,1, 0);
	 loginui.getLoginName().sendKeys(pl);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
public void loginOD() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 od=wb.getXLData(19,0, 0);
	 psw=wb.getXLData(19,1, 0);
	 loginui.getLoginName().sendKeys(od);
	 loginui.getPasword().sendKeys(psw);
	 loginui.getLoginButton().click();
}
}
