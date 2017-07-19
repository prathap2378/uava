package com.econsys.Genriclibrery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.econsys.test.LocalDriverManager;

public class Driver {
	
	
    static {
    	String currentPath = System.getProperty("user.dir");
    	System.setProperty("webdriver.chrome.driver",currentPath+"\\DriverFiles\\chromedriver.exe");
    	System.setProperty("webdriver.ie.driver",currentPath+"\\DriverFiles\\IEDriverServer.exe");
       
    	
    	
	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.ie.driver","D:\\Softwares\\Selenium softwares\\IEDriverServer_Win32_2.39.0\\IEDriverServer.exe");
    }
    
    //firefox driver**
    protected static WebDriver driver = new FirefoxDriver();
    
    //chrome driver**
    //protected static WebDriver driver = new ChromeDriver();

    //launching IE browser**
    //public static WebDriver driver= new InternetExplorerDriver();
    
    public static WebDriver driver(){
	
    return driver;
    }
    

}
