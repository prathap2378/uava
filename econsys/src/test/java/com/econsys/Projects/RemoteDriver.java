package com.econsys.Projects;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.EconsysVariables;

public class RemoteDriver {
	
	/*Monorail monorail=new Monorail();*/
	//protected static WebDriver driver;
	static WebDriver driver;
	static String baseUrl;
	static String nodeUrl;
	@Test
	public void seleniumGrid() throws Exception{
		//System.setProperty("webdriver.chrome.driver","D:\\Monorail_1\\Monorail_1\\Econsys_Auto\\Jarfiles\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E://WorkSpace//Econsys_Auto//Jarfiles//chromedriver.exe");
		driver();
		//praveenMachine();
	}
	
	public WebDriver remoteDriver() throws MalformedURLException{
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WIN10);
		
		//remoteDriver=
				driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		return driver;
	}
	public WebDriver remoteDriver1() throws MalformedURLException{
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		
		//remoteDriver=
				driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		return driver;
	}
	public void praveenMachine() throws IOException, InterruptedException{
		baseUrl="http://10.0.0.16";
		nodeUrl="http://10.0.0.180:8090/wd/hub";
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WIN8);
		driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		driver.get(baseUrl);
		System.out.println("grid sucess");
	}
	public void ameenMachine() throws IOException, InterruptedException{
		baseUrl="http://10.0.0.16";
		nodeUrl="http://10.0.0.61:8090/wd/hub";
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WIN8);
		driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		driver.get(baseUrl);
		System.out.println("grid sucess");
	}
	public static WebDriver driver() throws Exception{
		baseUrl="http://10.0.0.16:8081";
		nodeUrl="http://10.0.0.182:5555/wd/hub";
		//System.setProperty("webdriver.chrome.driver","E:/WorkSpace/Econsys_Auto/Jarfiles/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\Monorail_1\\Monorail_1\\Econsys_Auto\\Jarfiles\\chromedriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
		
		capabilities.setBrowserName("Internet Explorer");
		
		capabilities.setPlatform(Platform.XP);
		
		System.out.println("*******");
		driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		driver.get(baseUrl);
		
//		EconsysVariables ev = new EconsysVariables();
//		Monorail.monorailTestFlow(ev.estimatedSize, ev.location);
		
		System.out.println("grid sucess");
		driver.quit();
		return driver;
		
	}
}
