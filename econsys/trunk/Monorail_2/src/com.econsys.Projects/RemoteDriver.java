package adminpage;


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

public class RemoteDriver {
	
	/*Monorail monorail=new Monorail();*/
	WebDriver driver;
	WebDriver remoteDriver;
	String baseUrl, nodeUrl;
	@Test
	public void seleniumGrid() throws IOException, InterruptedException{
		harishMachine();
		//praveenMachine();
		
	}
	
	public WebDriver remoteDriver() throws MalformedURLException{
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WIN8);
		
		remoteDriver=driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		return remoteDriver;
	}
	public WebDriver remoteDriver1() throws MalformedURLException{
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		
		remoteDriver=driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		return remoteDriver;
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
		remoteDriver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		remoteDriver.get(baseUrl);
		System.out.println("grid sucess");
	}
	public void harishMachine() throws IOException, InterruptedException{
		baseUrl="http://10.0.0.16";
		nodeUrl="http://10.0.0.82:8091/wd/hub";
		//System.setProperty("webdriver.firefox.bin","PATH_TO_BINARY");
		
		  
		
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WIN8);
		
		File pathBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary Binary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxPro = new FirefoxProfile();  
		
		
		remoteDriver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		remoteDriver = new FirefoxDriver(Binary,firefoxPro); 
		remoteDriver.get(baseUrl);
		System.out.println("grid sucess");
	}
}
