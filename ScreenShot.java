package com.clc.ohrm.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.clc.utility.BrowserConstants;
import com.clc.utility.BrowserStuff;
import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) {
		try {
			WebDriver driver = BrowserStuff.getBrowserInstance(BrowserConstants.BrowserTypes.Chrome);
			driver.get(BrowserConstants.OHRM_URL);
			
//		LoginPage lp=	PageFactory.initElements(driver, LoginPage.class);
//		lp.loginPage();

			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			driver.findElement(By.id("btnLogin")).click();
			
			TakesScreenshot ts = (TakesScreenshot) BrowserStuff.driver;
			File file = ts.getScreenshotAs(OutputType.FILE);

			Files.copy(file, new File("D:\\ScreenShots\\ohrmlogin3.png"));

		} catch (Exception e) {
			System.out.println("Screenshot captured");

		}
	}

}
