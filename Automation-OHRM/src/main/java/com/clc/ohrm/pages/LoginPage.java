package com.clc.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.clc.utility.BrowserStuff;

public class LoginPage {
	
	public static Dashboard loginPage() {

		WebElement username = BrowserStuff.driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = BrowserStuff.driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin");

		WebElement loginbtn = BrowserStuff.driver.findElement(By.id("btnLogin"));
		loginbtn.click();
		return PageFactory.initElements(BrowserStuff.driver, Dashboard.class);
	}

}
