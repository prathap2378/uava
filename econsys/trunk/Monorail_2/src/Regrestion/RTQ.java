package Regrestion;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.testdata.in.Workbook;

import adminpage.*;

public class RTQ {
	Workbook wb=new Workbook();
	Basic b= new Basic();
	Login login= new Login();
	String url;
	String un;
	String pwd;
	
@Test
  public void rtq() throws InterruptedException, IOException, AWTException {
	  url=wb.getXLData(1,3,0);
	  login.url(url);
	  un=wb.getXLData(1,0,0);
	  pwd=wb.getXLData(1,1,0);
	  login.user(un, pwd);
	  b.rtqForm();
	  login.logout();
  }
  
  public void amber() throws IOException, InterruptedException{
	  url=wb.getXLData(1,3,0);
	  login.url(url);
	  un=wb.getXLData(1,0,0);
	  pwd=wb.getXLData(1,1,0);
	  login.user(un, pwd);
	  
  }
 }
