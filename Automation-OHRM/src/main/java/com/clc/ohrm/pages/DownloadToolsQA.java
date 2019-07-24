package com.clc.ohrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadToolsQA {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		String pathToDownload = "D:\\ScreenShots";

		// ChromeOptions option=new ChromeOptions();
		FirefoxOptions option = new FirefoxOptions();
		option.addPreference("browser.download.folderList", 2);
		option.addPreference("browser.helperApp.alwaysAsk.force", false);
		option.addPreference("broswer.download.dir", pathToDownload);
		option.addPreference("browser.download.manager.showWhenSatring", false);
		option.addPreference("browser.helperApps.neverAsk.saveToDisk",
				"tesx/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/mxl");
		
		FirefoxDriver driver = new FirefoxDriver(option);
		driver.get("https://skpatro.github.io/demo/links/");

	}

}
