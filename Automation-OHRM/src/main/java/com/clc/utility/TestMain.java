package com.clc.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.clc.ohrm.pages.Dashboard;
import com.clc.ohrm.pages.LoginPage;

public class TestMain {

	public static void main(String[] args) {
		WebDriver driver = BrowserStuff.getBrowserInstance(BrowserConstants.BrowserTypes.Chrome);
		driver.get(BrowserConstants.OHRM_URL);

		LoginPage lp = PageFactory.initElements(BrowserStuff.driver, LoginPage.class);
		lp.loginPage();
		Dashboard db=PageFactory.initElements(BrowserStuff.driver, Dashboard.class);
		//db.navigateToAdminUsers();
		db.empRecord("hannah.flores","fiona.grace","john.smith","robert.craig");
	}

}
