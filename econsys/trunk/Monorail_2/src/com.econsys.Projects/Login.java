package adminpage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.LoginPageui;
import com.monorail.Genriclibrery.*;
import com.testdata.in.Workbook;

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

  
public void user(String un,String pwd)throws IOException, InterruptedException {
	  //(String un,String pwd)
	  cu.waitForPageToLoad();
	  loginui.getLoginName().sendKeys(un);
	  //log.info("login as user:"+un+"");
	  loginui.getPasword().sendKeys(pwd);
	  loginui.getLoginButton().click();
}
public void url(String url) throws IOException {
	  //String url
	  driver().get(url);
	  driver().manage().window().maximize();
	  //driver.navigate().refresh();
}
//Logout method
public void logout() throws InterruptedException{
	 Thread.sleep(1000);
	 //New theme logout link
	 driver.findElement(By.xpath("//span[@class='nav-item-label']/span")).click();
	 driver.findElement(By.xpath("//span[@class='nav-item-label']/span")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
	 
	 //OLD theme logout link
	 //loginui.getLogout().click();
}
//Login super admin
public void loginsuperadminTestServer() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 sa=wb.getXLData(28, 0, 0);
	 psw=wb.getXLData(28,1, 0);
	 login.user(sa, psw);
}
 //CL login details
 public void loginCL() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 cl=wb.getXLData(16, 0, 0);
	 psw=wb.getXLData(16,1, 0);
	 login.user(cl, psw);

}
//EL login details
public void loginEL() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 el=wb.getXLData(13, 0, 0);
	 psw=wb.getXLData(13,1, 0);
	 login.user(el, psw);
}
//Board login details
public void board() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 bor=wb.getXLData(4, 0, 0);
	 psw=wb.getXLData(4,1, 0);
	 login.user(bor, psw);
}
//SL login details
public void loginSL() throws IOException, InterruptedException{
	 Login login=new Login(); 
	 cu.waitForPageToLoad();
	 sl=wb.getXLData(10, 0, 0);
	 psw=wb.getXLData(10,1, 0);
	 login.user(sl, psw);
}
//SD login details
public void loginSD() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 sd=wb.getXLData(7, 0, 0);
	 psw=wb.getXLData(7, 1, 0);
  	 login.user(sd,psw);
}
//PL login details
public void loginPL() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 pl=wb.getXLData(22,0, 0);
	 psw=wb.getXLData(22,1, 0);
	 login.user(pl, psw);
}
public void loginOD() throws IOException, InterruptedException{
	 Login login=new Login();
	 cu.waitForPageToLoad();
	 od=wb.getXLData(19,0, 0);
	 psw=wb.getXLData(19,1, 0);
	 login.user(od, psw);
}
}
