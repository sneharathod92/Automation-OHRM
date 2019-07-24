package com.clc.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import com.clc.utility.BrowserConstants.BrowserTypes;

public class BrowserStuff {
	 
	public static WebDriver driver;
	public static WebDriver getBrowserInstance(BrowserTypes type) {
		
		switch (type) {
		case Chrome:
			System.setProperty(BrowserConstants.CHROME_DRIVER_PROPERTY, BrowserConstants.CHROME_DRIVER_FILE);
			driver = new ChromeDriver();
			break;

		case Firefox:
			System.setProperty(BrowserConstants.FIREFOX_DRIVER_PROPERTY, BrowserConstants.FIREFOX_DRIVER_FILE);
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		return driver;

	}

}
