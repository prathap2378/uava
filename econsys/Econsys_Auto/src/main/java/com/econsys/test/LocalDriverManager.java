/**
 * 
 */
package com.econsys.test;

import org.openqa.selenium.WebDriver;

/**
 * @author bhanu.pk
 *
 */
public class LocalDriverManager {
	
	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	 
    public static WebDriver getDriver() {
        return webDriver.get();
    }
 
    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}
