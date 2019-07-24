package com.clc.toolsqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserStuff;

public class SSLCertificate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//handle untrusted certificate using selenium
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriver driver = new ChromeDriver(cap);
//		driver.get("https://demoqa.com/dialog/");
		driver.get("http://www.cacert.org/");

	}

}
