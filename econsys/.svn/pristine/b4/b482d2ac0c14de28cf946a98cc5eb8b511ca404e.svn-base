package com.econsys.Genriclibrery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.econsys.test.LocalDriverManager;

public class Driver {
	static String currentPath;
	//public static WebDriver driver;
	
	static String srcPath = System.getProperty("user.dir");
	
	static {
		
		/*
		 * System setting properties
		 */
		System.setProperty("webdriver.chrome.driver",srcPath+"\\Jarfiles\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver",srcPath+"\\Jarfiles\\IEDriverServer.exe");
		
    	System.setProperty("webdriver.gecko.driver",srcPath+"\\Jarfiles\\geckodriver.exe");    
    }
	
	 //*Launching Mozilla driver
	 
	//protected static WebDriver driver = new FirefoxDriver();
	
	 //*Launching Chrome driver** 
	 
       protected static WebDriver driver = new ChromeDriver();
    /*
     * Launching IE browser**
     */
    //public static WebDriver driver= new InternetExplorerDriver();
    
    public static WebDriver driver(){

    	return driver;
    }
    

}
