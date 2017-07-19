package POC.Econsys_Auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;


public class Robotqq {
	
	public void actionfiles() throws AWTException, InterruptedException{	
		/*String filepath=System.getProperty("user.dir");*/
		//String filepath[]={"C:\\Users\\kaveri.r\\Documents\\Lightshot\\Monorail\\Browse.png","C:\\Users\\kaveri.r\\Documents\\Lightshot\\Monorail\\SignIn.png"};
		/*for(int i=0;i<=1;i++){
			driver.findElement(By.id("rtqForm-dropzone")).click();
		// Specify the file location with extension
			 StringSelection sel = new StringSelection(filepath[i]);
			// Copy to clipboard
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			 	 System.out.println("selection" +sel+" File Name "+filepath[i]);*/
		/*StringSelection sel = new StringSelection(filepath);*/
		/*Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);*/

		Robot robot = new Robot();
		 
		 
		  // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		// Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 Thread.sleep(1000);
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 Thread.sleep(1000);   
		        // Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		}
		}
	
	
	
