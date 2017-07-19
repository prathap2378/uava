package unusedclass;
import java.io.IOException;

import org.openqa.selenium.By;
import org.sikuli.script.*;

import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

import adminpage.Basic;
import adminpage.Login;

public class SikuliTest extends Driver{
	static Login login=new Login();
	static Workbook wb=new Workbook();
	
	public static void main(String[] args) throws IOException, InterruptedException {
        Screen s = new Screen();
        Pattern img = new Pattern("D:\\Browse.png");
        try{
        	String url=wb.getXLData(1, 3, 0);
    		login.url(url);
    		Thread.sleep(1000);
    		String un=wb.getXLData(1,0, 0);
    		String pwd=wb.getXLData(1, 1, 0);
    		login.user(un,pwd);
    		driver().findElement(By.linkText("New RTQ")).click();
    		Thread.sleep(2000);
    		String filepath=System.getProperty("user.dir");
    		// nrtq.getUploaddocument().sendKeys(filepath+"\\Documentsuploded\\G1 Gateway Approval.doc");
    		s.type(Key.DOWN,Key.CTRL);
    	
    		s.click(img);
    		s.type(img,"C:\\Users\\bhanu.pk\\Desktop\\TaskCP3CP4.java");

                //s.click("SikuliImg.png");
                /*s.wait("spotlight-input.png");
                s.click();*/
                
        }
        catch(FindFailed e){
                e.printStackTrace();
        }
}
}
