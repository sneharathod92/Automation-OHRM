package com.clc.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadChromeToolsQA {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       String downloadFilepath = "D:\\ScreenShots";

	      /* HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 2);
	       chromePrefs.put("download.default_directory", downloadFilepath);
	       */
	       ChromeOptions options = new ChromeOptions();
//	       options.addArguments("profile.default_content_settings.popups", 2);
//	       options.setExperimentalOption("prefs", 2);
	       options.addArguments("download.default_directory", downloadFilepath);
	       
	       
	       options.addArguments("--test-type");
	       options.addArguments("--disable-extensions"); //to disable browser extension popup
//	       options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	      WebDriver driver = new ChromeDriver(options);
	                driver.get("http://www.seleniumhq.org/download/");
	                driver.findElement(By.linkText("32 bit Windows IE")).click();

	}

}
